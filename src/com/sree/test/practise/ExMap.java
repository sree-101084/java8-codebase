package com.sree.test.practise;

import java.util.stream.IntStream;

public class ExMap {

	public static void main(String[] args) {

		IntStream.range(1, 10)
		.map(s->s+s)
		.average()
		.ifPresent(System.out::println);
	}

}
