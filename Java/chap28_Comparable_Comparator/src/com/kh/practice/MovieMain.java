package com.kh.practice;

import java.util.ArrayList;
import java.util.List;

public class MovieMain {

	public static void main(String[] args) {
		List<Movie> movie = new ArrayList<>();
		movie.add(new Movie("���� �ȼ�",1996));
		movie.add(new Movie("ų ��1", 1994));
		movie.add(new Movie("ų ��2", 1995));
		
		Collections.short(movie);
		for(Movie mv : movie) {
			System.out.println(mv);
		}

	}

}
