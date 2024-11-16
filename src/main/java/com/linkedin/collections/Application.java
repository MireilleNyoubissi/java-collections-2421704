package com.linkedin.collections;
import java.util.collection;
import java.util.Arraylist;
import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<>();
		c.add("snowboard");
		c.add("books");
		c.add("linux");
		c.add("swoaboard");

		Collection<String> favouriteThings = new HashSet<>(c);

		System.out.println(favouriteThings);


	}

}
