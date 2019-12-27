package com.sree.test.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.sree.test.data.Student;
import com.sree.test.data.StudentDataBase;

public class BiFunctionStudentExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (student, predicateData) -> {

		Map<String,Double> mapData = new HashMap<>();
		student.forEach((students)->{
			if(predicateData.test(students)) {
				mapData.put(students.getName(), students.getGpa());
			}
		});
		return mapData;
		
	};

	public static void main(String[] args) {

		System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateExample.studentData.and(PredicateExample.studentData1)));
		
	}

}
