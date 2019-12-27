package com.sree.test.lambda;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.sree.test.data.Student;
import com.sree.test.data.StudentDataBase;

public class PredicateAndConsumerExample {
	
	Predicate<Student> p1 = (student)-> student.getGradeLevel()>=3;
	Predicate<Student> p2 = (student)-> student.getGpa()>=3.9;
	BiPredicate<Integer, Double> p3 = (GradeLevel,Gpa)->GradeLevel>=3 && Gpa>=3.9;
	BiConsumer<String, List<String>> consumer = (name,activities)->System.out.println(name+":"+activities);
	
	Consumer<Student> consumerData = (student->{
		
		//if(p1.and(p2).test(student)) { //Predicate example
		if(p3.test(student.getGradeLevel(), student.getGpa())) { //BiPredicate Test
			consumer.accept(student.getName(), student.getActivities());
		}
	});
	
	public void studentDetails(List<Student> studentList) {
		
		studentList.forEach(consumerData);
		
	}
	
	public static void main(String sre[]) {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
	
		new PredicateAndConsumerExample().studentDetails(studentList);
		
		
	}

}
