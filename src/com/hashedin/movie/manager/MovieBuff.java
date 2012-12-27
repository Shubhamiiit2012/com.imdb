package com.hashedin.movie.manager;

import java.util.HashMap;

import org.apache.log4j.Logger;

import com.hashedin.movie.model.Movie;
import com.hashedin.movie.model.MovieDatabase;
import com.hashedin.movie.model.User;

/**
 * 
 * @author shubham
 *
 */
public class MovieBuff {
	public static final Logger LOGGER = Logger.getLogger(MovieBuff.class);
	HashMap<Integer, Movie> movieMap = null;
	HashMap<Integer, User> userMap = null;

	public MovieBuff(MovieDatabase movieDb) throws NullPointerException {
		movieMap = movieDb.getMovieMap();
		userMap = movieDb.getUserMap();
		
		
		  for(int i = 0; i<movieMap.size(); i++){ if(movieMap.containsKey(i))
		  System.out.println(movieMap.get(i).toString());
		  
		  } for(int i = 0; i<userMap.size(); i++){ if(userMap.containsKey(i))
		  System.out.println(userMap.get(i).toString());
		  
		  }
		 
		LOGGER.info("MovieBuff has completed.");

	}

	public String showOutput() {
		return movieMap.get(1).toString();
	}
}
