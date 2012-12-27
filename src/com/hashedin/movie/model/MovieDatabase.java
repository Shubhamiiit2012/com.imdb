package com.hashedin.movie.model;


import java.util.HashMap;

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
	public MovieDatabase(HashMap<Integer, Movie> movieMap, HashMap<Integer, User> userMap) {
		
		this.movieMap=movieMap;
		this.userMap=userMap;
	}
	
	public HashMap<Integer, Movie> getMovieMap() {
		return movieMap;
	}
	
	public HashMap<Integer, User> getUserMap() {
		return userMap;
	}


}
