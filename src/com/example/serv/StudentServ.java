package com.example.serv;

import java.util.List;

import com.example.dto.Student;

public interface StudentServ {
	public void addStudent(Student student);
	public List<Student> showAll();
	public void deleteStudent(int sId);

}
