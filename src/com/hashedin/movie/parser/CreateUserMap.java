package com.hashedin.movie.parser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import com.hashedin.movie.model.User;

public class CreateUserMap {

	HashMap<Integer, User> userMap = new HashMap<Integer, User>();

	public CreateUserMap(String userFile) {
		createUserMap(userFile);
	}

	private void createUserMap(String userFile) {

		String str = "";
		FileInputStream fileInput = null;
		BufferedReader bReader = null;
		User userObject = null;

		try {
			fileInput = new FileInputStream(userFile);
			bReader = new BufferedReader(new InputStreamReader(fileInput));
			while ((str = bReader.readLine()) != null) {
				System.out.println(str);
				String tokken[] = ParseStringClass.parseString(str, "[|]+");
				userObject = new User(Integer.valueOf(tokken[0]),
						Integer.valueOf(tokken[1]), Integer.valueOf(tokken[4]),
						tokken[2], tokken[3]);
				userMap.put(Integer.valueOf(tokken[0]), userObject);
			}
		} catch (Exception e) {

		}
	}

	public HashMap<Integer, User> getUserMap() {
		return userMap;
	}

}