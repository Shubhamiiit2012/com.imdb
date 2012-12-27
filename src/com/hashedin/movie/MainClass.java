
package com.hashedin.movie;

import org.apache.log4j.Logger;

import com.hashedin.movie.manager.*;

public class MainClass {

	/**
	 * @param args
	 */
	public static final Logger LOGGER = Logger.getLogger(MainClass.class);
	public static void main(String[] args) {
		
		MovieManager movieManager=new FileMovieManager("movie.data","ratings.data","genre.data","user.data");
		
		MovieBuff movieBuff=new MovieBuff(movieManager.getDatabase());
		movieBuff.showOutput();
		
		LOGGER.info("Your Code Runs.");
	}

}
