package com.sree.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String data =sc.nextLine();  //SREENIVAS
		
		char postConvert[] = data.toCharArray();
		
		int length = data.length();
		
		int count = 1;
		
		Map<Character,Integer> finalData = new HashMap<>();
		
		//Streams Way
		/*
		 * for (char c : postConvert) { finalData.merge(c, count, Integer::sum); }
		 * System.out.println(finalData);
		 */
		
		//Traditional Way
		for(char c :postConvert) {
			if(finalData.containsKey(c)) {
				finalData.put(c, finalData.get(c)+1);
			}else {
				finalData.put(c, 1);
			}
		}
		System.out.println(finalData);
		
		/*
		 * for(int i=0;i<length;++i) {
		 * 
		 * if(finalData.containsKey(postConvert[i])) { finalData.put(postConvert[i],
		 * ++count); }else finalData.put(postConvert[i], count); }
		 * System.out.println(finalData);
		 */
		
		/*
		 * for(int i=0;i<length;i++) {
		 * 
		 * for(int j=i+1;i<length;j++) {
		 * 
		 * if(postConvert[i].equals(postConvert[j])) { count++; }
		 * System.out.println(postConvert[i]+"="+count ); }
		 * 
		 * }
		 */
		
		
	}

}
