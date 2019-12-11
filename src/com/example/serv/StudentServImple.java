package com.example.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDao;
import com.example.dto.Student;
@Service
public class StudentServImple implements StudentServ {
	@Autowired
	private StudentDao  studentDao;
	
	@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);
		
	}

}
