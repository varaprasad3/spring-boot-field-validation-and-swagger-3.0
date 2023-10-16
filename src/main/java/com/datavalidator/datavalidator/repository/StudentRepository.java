package com.datavalidator.datavalidator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datavalidator.datavalidator.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
