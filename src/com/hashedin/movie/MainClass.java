package com.hashedin.movie;

import org.apache.log4j.Logger;

import com.hashedin.movie.manager.FileMovieManager;
import com.hashedin.movie.manager.MovieBuff;
import com.hashedin.movie.manager.MovieManager;

/**
 * This is the main class. It is concerned with only com.hashedin.movie.manager package.
 * It calls the FileMovieManager to create database.
 * It also calls MovieBeff to run queries on movie database.
 */
public class MainClass {
	
	public static final Logger LOGGER = Logger.getLogger(MainClass.class);

	public static void main(String[] args) {

		MovieManager movieManager = new FileMovieManager("movie.data",
				"ratings.data", "genre.data", "user.data");

		MovieBuff movieBuff = new MovieBuff(movieManager.getDatabase());
		movieBuff.showOutput();

		LOGGER.info("Your Code Runs.");
	}

}
