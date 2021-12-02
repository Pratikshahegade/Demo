package com.college.service;

import com.college.dao.StudentDao;
import com.college.modal.Student;

public class StudentService {
	
	public boolean setstudent(Student S)
	{
			StudentDao s=new StudentDao();
			s.setstudent(S);
			return true;
	}
}