package com.sree.test;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class SumOfMutiples {
	
	static Predicate<Integer> p1 = i->i%3==0;
	static Predicate<Integer> p2 = i->i%5==0;

	public static void main(String[] args) {

		Integer sum = IntStream.range(1, 1000)
				.filter((IntPredicate) p1.or(p2))
				.sum();
		System.out.println(sum);
	}

}
