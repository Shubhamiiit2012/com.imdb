package com.hashedin.movie.manager;

import com.hashedin.movie.model.MovieDatabase;

public class FileMovieManager implements MovieManager {
	
	private MovieDatabase movieDatabase=null;
	
	
	public FileMovieManager(String movieFile,String ratingsFile, String genreFile, String usersFile){
		movieDatabase = new MovieDatabase(movieFile);
		
		
	}
	
	@Override
	public MovieDatabase getDatabase() {
		
		return movieDatabase;
	}
	
}
