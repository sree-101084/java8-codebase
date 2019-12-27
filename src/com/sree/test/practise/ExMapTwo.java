package com.sree.test.practise;

import java.util.Arrays;
import java.util.List;

public class ExMapTwo {

	public static void main(String[] args) {

		
		List<String> dataString = Arrays.asList("Sree","Nivas","Pari","Kavya","Hans","Tanu");
		dataString.stream()
		.map(String::toLowerCase)
		.filter(s->s.startsWith("s"))
		.forEach(System.out::println);
	}

}
