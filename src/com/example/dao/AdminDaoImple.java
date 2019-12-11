package com.example.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.example.dto.Admin;
@Repository
public class AdminDaoImple implements AdminDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public boolean login(Admin admin) {
			boolean flag = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

				@Override
				public Boolean doInHibernate(Session session) throws HibernateException {
					Transaction transaction = session.beginTransaction();
					Query q = session.createQuery("from Admin where adminName = ? and adminpass = ?");
					q.setString(0, admin.getAdminName());
					q.setString(1, admin.getAdminPass());
					List<Admin> alist = q.list();
					transaction.commit();
					session.flush();
					session.close();
					return !alist.isEmpty();
				}
			});
		return flag;
	}

}
