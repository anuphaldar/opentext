package com.tyss.dept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.dep.dto.Dept;

public class UpdateData {

	public static void main(String[] args) 
	{
		Dept d=new Dept();
		d.setDeptno(3000);
		d.setDname("Mathematics");
		d.setLocation("Kolkata");
		System.out.println("Anup");
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Dept.class);//Automatically create the table and insert data provided
		System.out.println("Anup");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session s=factory.openSession();
		Transaction t=s.beginTransaction();	
		
		//s.save(d);
		s.update(d);
		t.commit();
		s.close();

	}

}
