package com.jwt.service;

import java.util.List;

import com.jwt.model.Student;

public interface StudentService {

	public void addStudent(Student student);
	public Student getStudent(int id);
	public List<Student> getAllStudent();
	public Student updateStudent(Student student);
	public void deleteStudent(int id);
	
}
