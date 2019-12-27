package com.sree.test.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.sree.test.data.Student;
import com.sree.test.data.StudentDataBase;

public class StreamFlatMapExample {

	
	public static List<String>  getActivities(){
		
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());
	}
	
	public static long  getActivitiesCount(){
		
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct().count();
		}
	
	public static List<String>  getActivitiesSorted(){
		
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		}
	
	
	public static void main(String[] args) {

		
		System.out.println(getActivities());
		System.out.println(getActivitiesCount());
		System.out.println(getActivitiesSorted());
	}

}
