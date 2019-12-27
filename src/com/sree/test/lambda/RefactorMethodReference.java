package com.sree.test.lambda;

import java.util.function.Predicate;

import com.sree.test.data.Student;
import com.sree.test.data.StudentDataBase;

public class RefactorMethodReference {

	static Predicate<Student> studentData = RefactorMethodReference::getPredicateData;
	
	public static boolean getPredicateData(Student s) {
		return s.getGradeLevel()>=3;
		
	}
	public static void main(String[] args) {

		System.out.println(StudentDataBase.getStudentData.get());
		
	}

}
