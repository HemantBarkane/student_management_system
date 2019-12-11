package com.example.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.Student;
import com.example.serv.StudentServ;
@Controller
public class StudentController {
	@Autowired
	private StudentServ studentServ ;
	
	@RequestMapping("/student")
	public String display(){
		return "student";
		
	}
	
	@RequestMapping(value="/add_student")
	public String prepAddStudent(Student student,ModelMap map){
		map.put("student", new Student());
		//studentServ.addStudent(student);
		return "add_student";
	}
	
	@RequestMapping(value="/studentAdd")
	public String studentAdd(Student student,ModelMap map){
		map.put("student", new Student());
		studentServ.addStudent(student);
		
		return "student_home";
		
	}
}
