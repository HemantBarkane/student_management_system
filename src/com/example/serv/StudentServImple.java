package com.example.serv;

import java.util.List;

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

	@Override
	public List<Student> showAll() {
		return studentDao.showAll();
	}

	@Override
	public void deleteStudent(int sId) {
		studentDao.deleteStudent(sId);
	}
	
}
