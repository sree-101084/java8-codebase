package com.sree.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.sree.test.data.Student;
import com.sree.test.data.StudentDataBase;

public class StreamReduceExample {
	
	public static Optional<Student> getHighestGpa(){
		
		return StudentDataBase.getAllStudents().stream()
		.reduce((s1,s2)->(s1.getGpa()>s2.getGpa()) ? s1:s2);
	}

	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(1,2,4,6);
		data.stream()
		.findFirst()
		.ifPresent(System.out::println);
		
		Optional<Student> highestGpa = getHighestGpa();
		if(highestGpa.isPresent()) {
			System.out.println(highestGpa.get());
		}
	}

}
