package com.hashedin.movie.parser;

/**
 * This is a parsing class, which takes string and delimiter as input and splits string accordingly.
 * The splitted tokkens are then returned hand to hand.
 */
public class ParseStringClass {

	public static String[] parseString(String string, String delimiter){
		String token[]=string.split(delimiter);
		return token;
	}

}

