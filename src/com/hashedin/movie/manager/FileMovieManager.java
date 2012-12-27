package com.hashedin.movie.manager;

import java.util.HashMap;

import com.hashedin.movie.model.Movie;
import com.hashedin.movie.model.MovieDatabase;
import com.hashedin.movie.model.User;
import com.hashedin.movie.parser.CreateMovieMap;
import com.hashedin.movie.parser.CreateUserMap;

public class FileMovieManager implements MovieManager {
	
	private MovieDatabase movieDatabase=null;
	
	
	public FileMovieManager(String movieFile,String ratingsFile, String genreFile, String usersFile){
		
		HashMap<Integer, Movie> movieMap = new CreateMovieMap(movieFile).getMovieMap();
		HashMap<Integer, User> userMap = new CreateUserMap(usersFile).getUserMap();
		movieDatabase = new MovieDatabase(movieMap, userMap);//movieFile, usersFile);
	
	}
	
	@Override
	public MovieDatabase getDatabase() {
		return movieDatabase;
	}
	
}
