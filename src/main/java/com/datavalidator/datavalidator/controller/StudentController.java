package com.datavalidator.datavalidator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datavalidator.datavalidator.dto.Student;
import com.datavalidator.datavalidator.dto.StudentRequest;
import com.datavalidator.datavalidator.helper.ResponseStructure;
import com.datavalidator.datavalidator.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class StudentController {

	@Autowired
	private StudentService service ;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody @Valid StudentRequest student) {
		return new ResponseEntity<>(service.saveStudent(student), HttpStatus.CREATED) ;
	}
	
	@GetMapping("/get/{id1}/{id2}")
	public ResponseEntity<Integer> header(@PathVariable Integer id1, @PathVariable Integer id2, HttpServletRequest request) {
		String headerMessage = request.getHeader("hi") ;
		System.out.println(headerMessage);
		int sum = id1 + id2 ;
		HttpHeaders responseHeader = new HttpHeaders() ;
		responseHeader.set("h1", headerMessage) ;
		
		return new ResponseEntity<Integer>(sum, responseHeader, HttpStatus.OK) ; 
	}
 }
