package com.hashedin.movie.manager;
import com.hashedin.movie.model.MovieDatabase;

public class FileMovieManager implements MovieManager {
	
	private MovieDatabase movieDatabase=null;
	//private UserDatabase userdataBase=null;
	
	public FileMovieManager(String movieFile,String ratingsFile, String genreFile, String usersFile){
		movieDatabase = new MovieDatabase(movieFile);
		//userdataBase=new UserDatabase(userFile);
		
	}
	
	@Override
	public MovieDatabase getDatabase() {
		
		return null;
	}
	
}
