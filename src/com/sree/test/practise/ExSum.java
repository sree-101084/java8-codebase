package com.sree.test.practise;

import java.util.stream.IntStream;

public class ExSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int sum = IntStream.range(1, 5)
		.sum();
		
		System.out.println(sum);
	}

}
