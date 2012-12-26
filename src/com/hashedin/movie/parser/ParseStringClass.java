package com.hashedin.movie.parser;

public class ParseStringClass {

	public static String[] parseString(String string, String delimiter){
		String token[]=string.split(delimiter);
		return token;
	}

}

