package com.jwt.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.StudentDao;
import com.jwt.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	
	@Override @Transactional
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	@Override
	public Student getStudent(int id) {
		return studentDao.getStudent(id);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentDao.getAllStudent();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentDao.updateStudent(student);
	}

	@Override
	public void deleteStudent(int studentId) {
		studentDao.deleteStudent(studentId);
	}

}
