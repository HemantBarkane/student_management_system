package com.example.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.example.dto.Student;
@Repository
public class StudentDaoImple implements StudentDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void addStudent(Student student) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction transaction = session.beginTransaction();
				session.save(student);
				transaction.commit();
				session.flush();
				session.close();
	
				return null;
			}
		});
		
	}

}
