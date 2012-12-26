package com.hashedin.movie.parser;

public class ParseStringClass {

	public static String[] parseString(String string, String delimiter){
		//System.out.println("Got here" + string);
		String token[]=string.split("[|()]+");
		//System.out.println(token[2]);
		return token;
	}

}

