
package com.hashedin.movie;

import com.hashedin.movie.manager.*;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MovieManager movieManager=new HardCodedMovieManager();
		//FileMovieManager("movie.data", "ratings.data", "", "");
		
		MovieBuff movieBuff=new MovieBuff(movieManager.getDatabase());
		
		System.out.println("It runs.");
		
	}

}
