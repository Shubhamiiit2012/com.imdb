package com.hashedin.movie.manager;

import java.util.HashMap;

import com.hashedin.movie.model.Movie;
import com.hashedin.movie.model.MovieDatabase;
import com.hashedin.movie.model.User;

public class MovieBuff {

	HashMap<Integer, Movie> movieMap = null;
	HashMap<Integer, User> userMap=null;
	
	public MovieBuff(MovieDatabase movieDb) throws NullPointerException {
		movieMap = movieDb.getMovieMap();
		userMap=movieDb.getUserMap();
		//System.out.println(movieMap.get(1).toString());
		for(int i = 0; i<movieMap.size(); i++){
			if(movieMap.containsKey(i))
				System.out.println(movieMap.get(i).toString());
				
		}
		for(int i = 0; i<userMap.size(); i++){
			if(userMap.containsKey(i))
				System.out.println(userMap.get(i).toString());
				
		}
		
		
	}

	public String showOutput(){
		return movieMap.get(1).toString();
	}
}
