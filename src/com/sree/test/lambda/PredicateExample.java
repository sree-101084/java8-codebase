package com.sree.test.lambda;

import java.util.List;
import java.util.function.Predicate;

import com.sree.test.data.Student;
import com.sree.test.data.StudentDataBase;

public class PredicateExample {
	
	static Predicate<Integer> p1 = (i)->i%3==0;
	static Predicate<Integer> p2 = (i)->i%5==0;
	static Predicate<Student> studentData = (s) ->s.getGradeLevel()>=3;
	static Predicate<Student> studentData1 = (s) ->s.getGpa()>=3.9;
	
	public static void findStudentByGrade() {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		System.out.println("Single Condition");
		studentList.forEach((student->{
			if(studentData.test(student)) {
				
				System.out.println(student.getName());
			}
		}));
		
	}
	
	public static void findStudentDataWithGradeandGpa() {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		System.out.println("Multiple Condition");
		studentList.forEach((student)->{
			
			if(studentData.and(studentData1).test(student)) {
				
				System.out.println(student.getName());
			}
		});
	}
	

	public static void main(String[] args) {
		findStudentByGrade();
		findStudentDataWithGradeandGpa();
	}

}
