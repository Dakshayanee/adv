package com.app.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper=true,exclude="passward")
@Table(name="students")
public class Student extends BaseEntity {
	@Column(length=20)
	private String firstname;
	public Student(String firstname, String lastname, String email, String passward, LocalDate dob) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.passward = passward;
		this.dob = dob;
	}
	@Column(length=20)
	private String lastname;
	@Column(length=20,unique=true)
	private String email;
	@Column(length=20,unique=true)
	private String passward;
	private LocalDate dob;
	
	
	
	

}
