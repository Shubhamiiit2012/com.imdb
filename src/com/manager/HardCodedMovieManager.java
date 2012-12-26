package com.manager;

import com.structureimplementation.MovieDatabase;


public class HardCodedMovieManager implements MovieManager {
	
	MovieDatabase movieDatabase=new MovieDatabase();
	@Override
	public MovieDatabase getDatabase() {
		
		return movieDatabase;
	}

}
