package com.hashedin.movie.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.hashedin.movie.parser.ParseStringClass;

/**
 * 
 * @author shubham
 * 
 */
public class MovieDatabase {

	private HashMap<Integer, Movie> movieMap = new HashMap<Integer, Movie>();
	
	private HashMap<Integer, User> userMap = new HashMap<Integer, User>();

	/**
	 * Movie Database Constructor executes methods to construct database in a
	 * sequence. Step 1. Data structure for movies is created. Step 2. Data
	 * structure for user is created.
	 * 
	 */
	public MovieDatabase(String movieFile, String userFile) {
		createMovieMap(movieFile);
		createUserMap(userFile);
	}
	

	
	
	private void createUserMap(String userFile) {
		
		String str = "";
		FileInputStream fileInput = null;
		BufferedReader bReader = null;
		User userObject = null;

		try {
			fileInput = new FileInputStream(userFile);
			bReader = new BufferedReader(new InputStreamReader(fileInput));
			while ((str = bReader.readLine()) != null) {
				String tokken[] = ParseStringClass.parseString(str, "[|]+");
				if (tokken.length != 5) {
					System.out.println("Line " + tokken[0]
							+ " can't be parsed.Why ");
				} else {
					userObject = new User(Integer.valueOf(tokken[0]),
							Integer.valueOf(tokken[1]),
							Integer.valueOf(tokken[4]), tokken[2], tokken[3]);
					userMap.put(Integer.valueOf(tokken[0]), userObject);
				}
			}
		} catch (Exception e) {

		}
		

	}
	
	
	

	public HashMap<Integer, Movie> getMovieMap() {
		return movieMap;
	}

	private void createMovieMap(String fileName) {

		String str = "";
		FileInputStream fileInput = null;
		BufferedReader bReader = null;
		Movie tempMovieObject = null;

		try {

			fileInput = new FileInputStream(fileName);
			bReader = new BufferedReader(new InputStreamReader(fileInput));

			while ((str = bReader.readLine()) != null) {

				String tokken[] = str.split("|");
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

		} catch (Exception e) {

		}

	}

	private int[] extractGenreIndices(String[] tokken) {
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
	
	public HashMap<Integer, User> getUserMap() {
		return userMap;
	}


}
