package com.sree.test.lambda;

import java.util.List;

import com.sree.test.data.Student;
import com.sree.test.data.StudentDataBase;

public class BiConsumer {

	public static void getNameAndActivities() {
		
		java.util.function.BiConsumer<String, List<String>> biConsumerData = (name,activies)->System.out.println(name+":"+activies);
		List<Student> studentData = StudentDataBase.getAllStudents();
		
		studentData.forEach((student)->{
			biConsumerData.accept(student.getName(), student.getActivities());
		});
		
		
	}
	public static void main(String[] args) {
		getNameAndActivities();
	}

}
