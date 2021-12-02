package com.college.dao;

import com.college.modal.Student;

public class StudentDao {
	
	public boolean setstudent(Student S)
	{
		System.out.println(S.print());
		return true;
	}

}
