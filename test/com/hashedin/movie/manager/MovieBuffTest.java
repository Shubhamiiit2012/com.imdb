package com.hashedin.movie.manager;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hashedin.movie.model.Movie;
import com.hashedin.movie.model.MovieDatabase;
import com.hashedin.movie.model.User;
import com.hashedin.movie.parser.CreateMovieMap;
import com.hashedin.movie.parser.CreateUserMap;

public class MovieBuffTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testMovieBuff() {
		HashMap<Integer, Movie> movieMap = new CreateMovieMap("movie.data").getMovieMap();
		HashMap<Integer, User> userMap = new CreateUserMap("user.data").getUserMap();
		MovieDatabase movieDatabase = new MovieDatabase(movieMap, userMap);
		MovieBuff myMovieBuff=new MovieBuff(movieDatabase);
		
		assertEquals("Movie name = Toy Story , year = 1995, Genres = ANIMATION CHILDREN COMEDY UNKNOWN ]", myMovieBuff.showOutput());
	}

}
