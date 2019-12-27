package com.sree.test.lambda;

import java.util.List;
import java.util.function.Consumer;

import com.sree.test.data.Student;
import com.sree.test.data.StudentDataBase;

public class ConsumerLambda {
	
	static Consumer<Student> cData1 = (student)->System.out.println(student);
	static Consumer<Student> cData2 =(student)->System.out.print(student.getName());
	static Consumer<Student> cData3 =(student)->System.out.print(student.getActivities());
	static Consumer<Student> cData4 =(student)->System.out.println(student.getGpa());
	
	/*
	 * public static void getStudentDetails() {
	 * 
	 * List<Student> allStudents = StudentDataBase.getAllStudents();
	 * allStudents.forEach(cData1); }
	 * 
	 * public static void getStudentDetailswithActives() { List<Student> allStudents
	 * = StudentDataBase.getAllStudents();
	 * 
	 * allStudents.forEach(cData2.andThen(cData3)); }
	 */
	
	public static void getStudentDetailswithConditional() {
		List<Student> allStudents = StudentDataBase.getAllStudents();	
		
		allStudents.forEach((student)->{
			if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
				cData2.andThen(cData3).andThen(cData4).accept(student);;
			}
		});
		
	}

	public static void main(String[] args) {
		//getStudentDetails();
		//getStudentDetailswithActives() ;
		getStudentDetailswithConditional();
	}

}
