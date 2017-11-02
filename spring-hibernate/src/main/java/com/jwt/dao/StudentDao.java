package com.jwt.dao;

import java.util.List;

import com.jwt.model.Student;

public interface StudentDao {

	
	public void addStudent(Student student);
	public List<Student> getAllStudent();
	public Student updateStudent(Student student);
	public void deleteStudent(int studentId);
	public Student getStudent(int id);
	
}
