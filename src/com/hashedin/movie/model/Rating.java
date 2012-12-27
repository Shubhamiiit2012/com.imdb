package com.hashedin.movie.model;

/**
 * This is the structure of Rating, i.e. collection of value of rating done by a user on a particular movie.
 *
 */
public class Rating {
	
	private Movie movie;
	private int rating;
	private User user;
	
	public Rating(Movie movie, int rating, User user) {
		super();
		this.movie = movie;
		this.rating = rating;
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getRating() {
		return rating;
	}

	public User getUser() {
		return user;
	}
	
}
