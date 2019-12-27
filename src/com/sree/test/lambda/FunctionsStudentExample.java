package com.sree.test.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.sree.test.data.Student;
import com.sree.test.data.StudentDataBase;

public class FunctionsStudentExample {

	static Function<List<Student>, Map<String,Double>> studentFunction = (student ->{
		
		Map<String, Double> gradeMapData = new HashMap<>();
			student.forEach((students)->{
				if(PredicateExample.studentData.and(PredicateExample.studentData1).test(students)) {
				gradeMapData.put(students.getName(), students.getGpa());
				}
			});
			return gradeMapData;
	});
	public static void main(String[] args) {

		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
	}

}
