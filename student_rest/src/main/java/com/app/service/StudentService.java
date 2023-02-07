package com.app.service;

import java.util.List;


import com.app.pojo.Student;



public interface StudentService {
   
	List<Student> getallStudents();
	
	public Student addstud(Student stud);
	
	public String deleteStud(Long rollno);
	
	public Student updateStud(Student emp);
}
