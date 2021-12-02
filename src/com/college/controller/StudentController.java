package com.college.controller;

import com.college.modal.Student;
import com.college.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		StudentService s=new StudentService();
		Student s1=new Student(3,"Pratiksha",22,"pratiksha@gmail.com");
		boolean b=s.setstudent(s1);
		if(b==true)
		{
			System.out.println("Success...");
		}
		else
		{
			System.out.println("Please try again...");
		}
	}

}
