package com.sree.test.lambda;

import java.util.function.Function;

public class MethodReferenceExampleFunction {

	static Function<String, String> data = String::toUpperCase;
	
	public static void main(String[] args) {
		
		System.out.println(data.apply("Java"));

	}

}
