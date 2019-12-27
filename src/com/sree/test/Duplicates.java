package com.sree.test;

import java.util.Map;
import java.util.stream.Collectors;

public class Duplicates {

	public static void main(String[] args) {

		String data = "The quick brown fox jumped over the lazy dog.";
        Map<String, Long> collect = data.chars()
        .mapToObj(i -> (char) i)
        .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        System.out.println(collect);
        
        
		/*
		 * Multiset<String> wordsMultiset = HashMultiset.create();
		 * wordsMultiset.addAll(words); for(Multiset.Entry<E>
		 * entry:wordsMultiset.entrySet()){
		 * System.out.println(entry.getElement()+" - "+entry.getCount()); }
		 */
		
		
	}

}
