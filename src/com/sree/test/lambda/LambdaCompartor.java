package com.sree.test.lambda;

import java.util.Comparator;

public class LambdaCompartor {

	public static void main(String[] args) {

		
		Comparator<Integer> compare = (a,b) -> a.compareTo(b);
		
		System.out.println("Lambda result post comparing :"+compare.compare(3, 4));
	}

}
