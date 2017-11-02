package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void addStudent(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudent() {
		return sessionFactory.getCurrentSession().createQuery("from Student").list();
	}

	@Override
	public Student updateStudent(Student student) {
		sessionFactory.getCurrentSession().update(student);
		return student;
	}

	@Override
	public void deleteStudent(int studentId) {
		Student student = (Student) sessionFactory.getCurrentSession().get(Student.class, studentId);
		
		sessionFactory.getCurrentSession().delete(student);
		
	}

	@Override
	public Student getStudent(int id) {
		
		return (Student)sessionFactory.getCurrentSession().get(Student.class, id);
	}

}
