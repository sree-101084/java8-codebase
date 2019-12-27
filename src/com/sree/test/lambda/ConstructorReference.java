package com.sree.test.lambda;

import java.util.function.Function;
import java.util.function.Supplier;

import com.sree.test.data.Student;

public class ConstructorReference {

	static Supplier<Student> studentData = Student::new;
	
	static Function<String, Student> functionStudentData = Student::new;
	public static void main(String[] args) {

		System.out.println(studentData.get());
		
		System.out.println(functionStudentData.apply("Sreenivas"));
	}
	

}
