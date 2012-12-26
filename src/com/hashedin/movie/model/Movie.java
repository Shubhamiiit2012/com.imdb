package com.hashedin.movie.model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String name;
	private int year;
	private List<Genre> genreList = new ArrayList<Genre>();

	public Movie(String name, int year, List<Genre> genreList) {
		this.name = name;
		this.year = year;
		this.genreList = genreList;
	}
	
	
	
	@Override
	public String toString() {
		System.out.println("Movie [name=" + name + ", year=" + year + ", Genres = " + printGenreList()+"]");
		return "";
	}



	private String printGenreList() {
		String str = "";
		for(Genre genre:genreList){
			str=str+genre.getGenreByCode(genre.getCode())+" ";
		}
		return str;
	}



	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public List<Genre> getGenreList() {
		return genreList;
	}
	
	
	
}
