package com.sree.test.practise;

import java.util.stream.IntStream;

public class ExOne {

	public static void main(String[] args) {

		IntStream.range(1, 10)
		.forEach(System.out::print);
		System.out.println();
		IntStream.rangeClosed(1, 10)
		.forEach(System.out::print);
	}

}
