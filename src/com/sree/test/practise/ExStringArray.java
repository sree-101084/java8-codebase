package com.sree.test.practise;

import java.util.Arrays;

public class ExStringArray {

	public static void main(String[] args) {

		String[] stringData = {"Sree","Nivas","Pari","Kavya","Hans","Tanu"};
		Arrays.stream(stringData)
		.filter(s->s.startsWith("H"))
		.sorted()
		.forEach(System.out::println);
	}

}
