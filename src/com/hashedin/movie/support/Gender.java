package com.hashedin.movie.support;

public enum Gender {
	MALE(0), FEMALE(1);
	private int code;

	private Gender(int code) {
		this.code = code;
	}

	public int getGenderCode() {
		return code;
	}

	public static Gender getGenderByCode(int code) {
		for (Gender g : Gender.values()) {
			if (g.code == code)
				return g;
		}
		throw new IllegalArgumentException();
	}
}