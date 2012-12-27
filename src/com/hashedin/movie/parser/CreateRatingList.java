package com.hashedin.movie.parser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.hashedin.movie.model.Rating;

/**
 * Yet to be implemented.
 * @author shubham
 *
 */
public class CreateRatingList {
	
	private List<Rating> ratingList= new ArrayList<Rating>();
	
	public CreateRatingList(String ratingFile){
		createRateList(ratingFile);
	}

	private void createRateList(String ratingFile) {
		
		FileInputStream fin=null;
		BufferedReader bReader = null;
		String str="";
		
		
		try {
			fin=new FileInputStream(ratingFile);
			bReader=new BufferedReader(new InputStreamReader(fin));
			
			while((str=bReader.readLine())!=null){
				
			}
			
		} catch (Exception e) {
			
		}
		
	}

	
	
	
}
