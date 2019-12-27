package com.sree.test.practise;

import java.util.stream.IntStream;

public class ExSkip {

	public static void main(String[] args) {

		IntStream.range(1, 10)
		.skip(5)
		.forEach(s->System.out.print(s));	
		}

}
