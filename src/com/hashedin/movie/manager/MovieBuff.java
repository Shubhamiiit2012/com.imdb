package com.hashedin.movie.manager;

import java.util.HashMap;
import javax.jws.soap.SOAPBinding.Use;

import com.hashedin.movie.model.Movie;
import com.hashedin.movie.model.MovieDatabase;
import com.hashedin.movie.model.User;

public class MovieBuff {

	public MovieBuff(MovieDatabase movieDb) {
		HashMap<Integer, Movie> movieMap = movieDb.getMovieMap();
		HashMap<Integer, User> userMap=movieDb.getUserMap();
		
		for(int i = 0; i<movieMap.size(); i++){
			if(movieMap.containsKey(i))
				movieMap.get(i).toString();
				
		}
		for(int i = 0; i<userMap.size(); i++){
			if(userMap.containsKey(i))
				System.out.println(userMap.get(i).toString());
				
		}
		
	}

}
