package com.hashedin.movie.parser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.hashedin.movie.model.Genre;
import com.hashedin.movie.model.Movie;

public class CreateMovieMap {

	private HashMap<Integer, Movie> movieMap=new HashMap<Integer, Movie>();
	
	public CreateMovieMap(String fileName){
		createMovieMap(fileName);
	}
	
	public void createMovieMap(String fileName) {

		
		String str = "";
		FileInputStream fileInput = null;
		BufferedReader bReader = null;
		Movie tempMovieObject = null;
		System.out.println("Reached Here....");
		try {

			fileInput = new FileInputStream(fileName);
			bReader = new BufferedReader(new InputStreamReader(fileInput));

			while ((str = bReader.readLine()) != null) {

				String tokken[] = str.split("[()|]+");
				List<Genre> genreList = new ArrayList<Genre>();

				if (tokken.length != 25) {
					System.out.println("Line " + tokken[0]
							+ " can't be parsed. ");
				} else {

					int[] genreIndices = extractGenreIndices(tokken);

					for (int i : genreIndices) {
						genreList.add(Genre.getGenreByCode(i));
					}

					tempMovieObject = new Movie(tokken[1],
							Integer.valueOf(tokken[2]), genreList);

					movieMap.put(Integer.valueOf(tokken[0]), tempMovieObject);
					
				}

			}
			fileInput.close();
			bReader.close();
		} catch (Exception e) {

		}

	}
	
	public HashMap<Integer, Movie> getMovieMap(){
		return movieMap;
	}

	private static int[] extractGenreIndices(String[] tokken) {
		int count = 0;
		for (String str : tokken) {
			if (str.equals("1"))
				count++;
		}

		int indexRecord[] = new int[count];
		count = 0;
		for (int i = 6; i < tokken.length; i++) {
			if (tokken[i].equals("1")) {
				indexRecord[count] = i - 6;
				count++;
			}

		}
		return indexRecord;
	}
}
