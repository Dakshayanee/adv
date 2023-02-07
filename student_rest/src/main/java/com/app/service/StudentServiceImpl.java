package com.app.service;

import java.util.List;

import org.springdoc.api.OpenApiResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojo.Student;
import com.app.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
   private StudentRepository studrepo;
	@Override
	public List<Student> getallStudents() {
		
		return studrepo.findAll();
	}
	@Override
	public Student addstud(Student stud) {
		
		return studrepo.save(stud);
	}
	@Override
	public String deleteStud(Long rollno) {
		if(studrepo.existsById(rollno)) {
			studrepo.deleteById(rollno);
			return "Successfull";
		}
		throw new OpenApiResourceNotFoundException("Invalid!!");
	}
	@Override
	public Student updateStud(Student emp) {
		if(studrepo.existsById(emp.getRollno())) {
			return studrepo.save(emp);
		}throw new OpenApiResourceNotFoundException("not found!!!");
			
		
	}

}
