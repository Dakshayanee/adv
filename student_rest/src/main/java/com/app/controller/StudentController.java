package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Student;
import com.app.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/students")
public class StudentController {
	@Autowired
    private StudentService studservice;
	
	public StudentController() {
		System.out.println("in stud controller");
	} 
    
    @GetMapping
    public List<Student> getallstud(){
    	return studservice.getallStudents();
    }
    
    @PostMapping
    public Student insertStud(@RequestBody Student stud) {
    	return studservice.addstud(stud);
    }
    
    @DeleteMapping
    public String deleteStudByid(@RequestParam Long rollno) {
    	
    	return studservice.deleteStud(rollno);
    }
    @PutMapping
    public Student editStudent(@RequestBody Student stud) {
    	return studservice.updateStud(stud);
    }
}
