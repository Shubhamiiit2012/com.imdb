package com.hashedin.movie.support;

public enum Gender {
	MALE(0), FEMALE(1);
	private int code;
	
	private Gender(int code){
		this.code=code;
	}
	public Gender getGender(){
		return this;
	}
}
