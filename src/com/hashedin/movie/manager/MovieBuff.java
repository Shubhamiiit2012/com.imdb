package com.hashedin.movie.manager;

import java.util.HashMap;

import com.hashedin.movie.model.Movie;
import com.hashedin.movie.model.MovieDatabase;

public class MovieBuff {

	public MovieBuff(MovieDatabase movieDb) {
		HashMap<Integer, Movie> movieList = movieDb.getMovieMap();
		
		for(int i = 0; i<movieList.size(); i++){
			if(movieList.containsKey(i))
				movieList.get(i).toString();
				
		}
		
	}

}
