package com.example.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dto.Admin;
import com.example.serv.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
//	@RequestMapping("/admin")
//	public String display(){
//		return "admin";
//	}
//	
	
	@RequestMapping(value="/admin")
	public String prepLogin(Admin admin,ModelMap model) {		
		model.put("admin", new Admin());
		return "admin";
	}
	
	@RequestMapping(value="/admin_login", method=RequestMethod.POST)
	public String login(Admin admin,ModelMap model) {
		boolean b = adminService.login(admin);	
		if(b) {
			return "admin_home";
		}
		return "admin";
	}

}
