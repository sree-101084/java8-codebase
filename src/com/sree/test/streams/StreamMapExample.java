package com.sree.test.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.sree.test.data.Student;
import com.sree.test.data.StudentDataBase;

public class StreamMapExample {
	
	public static List<String> getStudentName(){
		return StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase)
		.collect(Collectors.toList());
	}
	
	public static Set<String> getStudentNameSet(){
		return StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase)
		.collect(Collectors.toSet());
	}

	public static void main(String[] args) {

		
				System.out.println(getStudentName());
				System.out.println(getStudentNameSet());
		
	}

}
