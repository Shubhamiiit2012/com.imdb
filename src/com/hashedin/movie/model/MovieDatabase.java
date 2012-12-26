package com.hashedin.movie.model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MovieDatabase {
	private HashMap<Integer,Movie> movieMap = new HashMap<Integer,Movie>();
	private List<Genre> genreList=new ArrayList<Genre>();
	
	public MovieDatabase(String string){
		genreList.add(Genre.ACTION);
		movieMap.put(1, new Movie("Test Movie 1",1997,genreList));
		genreList.add(Genre.COMEDY);
		movieMap.put(2, new Movie("Test Movie 2",1984,genreList));
		movieMap.get(2).toString();
		createMovieDatabase(string);
	}

	private void createMovieDatabase(String string) {
		// TODO Auto-generated method stub
		
	}

	public HashMap<Integer, Movie> getMovieMap() {
		return movieMap;
	}

	public List<Genre> getGenreList() {
		return genreList;
	}
	
}
