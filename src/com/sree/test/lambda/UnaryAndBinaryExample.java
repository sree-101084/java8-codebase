package com.sree.test.lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryExample {
	
	static BinaryOperator<Integer> binaryData = (a,b)->a.compareTo(b);
	static Comparator<Integer> binaryDataCommp = (a,b)->a.compareTo(b);
	static UnaryOperator<String> unaryData = (a)->a.concat(" Programming");
 
	public static void main(String[] args) {

		System.out.println(unaryData.apply("Java"));
		System.out.println(binaryData.apply(4, 4));
		
		BinaryOperator<Integer> binaryCompareData = BinaryOperator.minBy(binaryDataCommp);
				System.out.println(binaryCompareData.apply(3, 4));
		 
		// @formatter:on

	}

}
