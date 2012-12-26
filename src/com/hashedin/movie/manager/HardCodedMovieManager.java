package com.hashedin.movie.manager;

import com.hashedin.movie.model.MovieDatabase;


public class HardCodedMovieManager implements MovieManager {
	
	MovieDatabase movieDatabase=new MovieDatabase("");
	
	@Override
	public MovieDatabase getDatabase() {
		
		return movieDatabase;
	}

}
