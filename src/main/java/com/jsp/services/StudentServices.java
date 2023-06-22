package com.jsp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

@Component
public class StudentServices {
	@Autowired
	StudentDao dao;
	public Student saveStudent(Student student) {
		return dao.saveStudent(student);
	}
	
	public Student updateStudent(Student student) {
		return dao.updateStudent(student);
	}
	
	public Student deleteStudent(int id) {
		return dao.deleteStudent(id);
	}
	
	public Student getById(int id) {
		return dao.getById(id);
	}
	
	public List<Student> getAll(){
		return dao.getAll();
	}
}
