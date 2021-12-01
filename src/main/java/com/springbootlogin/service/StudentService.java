package com.springbootlogin.service;

import java.util.List;

import com.springbootlogin.model.Student;

public interface StudentService {
	   List<Student> getAllStudents();
	      Student saveStudent(Student student);
	      Student getStudentById(Long id);
	      Student updateStudent(Student student);
	      void deleteStudentById(Long id);
}
