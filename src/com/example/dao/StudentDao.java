package com.example.dao;

import java.util.List;

import com.example.dto.Student;

public interface StudentDao {
	public void addStudent(Student student);
	 List<Student> showAll();
	 public void deleteStudent(int sId);
}
