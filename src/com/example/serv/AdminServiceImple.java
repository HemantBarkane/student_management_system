package com.example.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AdminDao;
import com.example.dto.Admin;
@Service
public class AdminServiceImple implements AdminService{
	@Autowired
	private AdminDao adminDao;
	
	@Override
	public boolean login(Admin admin) {
		
		return adminDao.login(admin);
	}

}
