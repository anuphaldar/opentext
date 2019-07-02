package com.opentext.Studentinfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.opentext.dep.table.dto.StudentInformation;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(StudentInformation.class);
        
        //new SchemaExport(cfg).create(true,true);
        
        
        StudentInformation st=new StudentInformation();
        st.setStudentid(122);
        st.setStudentname("Anup");
        st.setStudentemail("anuphaldar@gmail.com");
        st.setStudentphno(1234567);
        
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        
        Transaction t=s.beginTransaction();
       
        s.save(st);
        t.commit();
        
        s.close();
       
    }
}

