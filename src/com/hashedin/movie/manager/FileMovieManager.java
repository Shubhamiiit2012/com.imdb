package com.hashedin.movie.manager;

import java.util.HashMap;

import org.apache.log4j.Logger;

import com.hashedin.movie.model.Movie;
import com.hashedin.movie.model.MovieDatabase;
import com.hashedin.movie.model.User;
import com.hashedin.movie.parser.CreateMovieMap;
import com.hashedin.movie.parser.CreateUserMap;

/**
 * @author shubham
 * This class calls the methods to create data structures of movie and user.
 * Then it creates Movie database object by using data structures as fields. 
 */
public class FileMovieManager implements MovieManager {

	private MovieDatabase movieDatabase = null;
	public static final Logger LOGGER = Logger.getLogger(MovieManager.class);

	public FileMovieManager(String movieFile, String ratingsFile,
			String genreFile, String usersFile) {

		HashMap<Integer, Movie> movieMap = new CreateMovieMap(movieFile)
				.getMovieMap();
		HashMap<Integer, User> userMap = new CreateUserMap(usersFile)
				.getUserMap();
		movieDatabase = new MovieDatabase(movieMap, userMap);// movieFile,
																// usersFile);
		LOGGER.info("FileMovieManager has created database.");

	}

	@Override
	public MovieDatabase getDatabase() {
		return movieDatabase;
	}

}
