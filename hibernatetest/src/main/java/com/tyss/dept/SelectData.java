package com.tyss.dept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.dep.dto.Dept;

public class SelectData {

	public static void main(String[] args) 
	{
		
		System.out.println("Anup");
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Dept.class);//Automatically create the table and insert data provided
		System.out.println("Anup");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session s=factory.openSession();
		//Transaction t=s.beginTransaction();	
		
		//s.save(d);
		Dept d=(Dept) s.load(Dept.class,3000);
		System.out.println(d.getDeptno());
		System.out.println(d.getdname());
		System.out.println(d.getLocation());
		//t.commit();
		s.close();

	}

}

