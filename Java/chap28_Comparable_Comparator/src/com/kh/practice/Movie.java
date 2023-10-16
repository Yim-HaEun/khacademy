package com.kh.practice;
//CompareExam -> Movie  rename
//implement Compare

public class Movie implements Comparable<Movie>{
	private String title;
	private int year;
	
	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}
	
	@Override
	public int compareTo(Movie otherMovie) {
		//���������� �������� ��
		return this.year - otherMovie.year;
	}
	@Override
	public String toString() {
		return "Movie title = " + title + "/ year ="+ year;
	}

}
