package com.sree.test.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.sree.test.data.Student;
import com.sree.test.data.StudentDataBase;

public class StreamSortingComparatorExample {

	public static List<Student> getStudentListSorted(){
		
		return StudentDataBase.getAllStudents()
				.stream().sorted(Comparator.comparing(Student::getGpa).thenComparing(Student::getName).reversed())
				.filter(student ->student.getGender().equalsIgnoreCase("female"))
				.collect(Collectors.toList());
	}
	public static void main(String[] args) {

		getStudentListSorted().forEach(System.out::println);
		
	}

}
