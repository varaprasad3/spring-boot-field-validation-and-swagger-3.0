package com.datavalidator.datavalidator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import com.datavalidator.datavalidator.dto.Student;
import com.datavalidator.datavalidator.dto.StudentRequest;
import com.datavalidator.datavalidator.helper.ResponseStructure;
import com.datavalidator.datavalidator.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository sr;

	public Student saveStudent(StudentRequest studentRequest) {

		Student student = new Student();
		
		student.setName(studentRequest.getName());
		student.setEmail(studentRequest.getEmail());
		student.setPassword(studentRequest.getPassword());
		student.setMobilenumber(studentRequest.getMobilenumber());

		return sr.save(student);

	}
}
