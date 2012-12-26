package com.hashedin.movie.model;

import com.hashedin.movie.support.Gender;

public class User {
	private int id;
	private int age;
	private int zipCode;
	private Gender gen;
	private String occupation;
	
	public User(int id, int age, int zipCode, String gen, String occupation) {
		
		super();
		this.id = id;
		this.age = age;
		this.zipCode = zipCode;
		this.occupation=occupation;	
		
		if(gen.equals("M")){
			this.gen = Gender.MALE;
		} else {
			this.gen=Gender.FEMALE;
		}
	}

	@Override
	public String toString() {
		return "User id=" + id + ", age=" + age + ", zipCode=" + zipCode
				+ ", gender = " + Gender.getGenderByCode(gen.getGenderCode()) + ", Occupation = "+occupation+" ]";
	}
	
	
}
