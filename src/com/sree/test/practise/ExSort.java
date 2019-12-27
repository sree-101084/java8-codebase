package com.sree.test.practise;

import java.util.stream.Stream;

public class ExSort {

	public static void main(String[] args) {

		Stream.of("AB","DB","RB","MB")
		.sorted()
		.findFirst()
		.ifPresent(System.out::print);
	}

}
