package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        Configuration cfg = new Configuration().configure();  
        ////���ɲ����sql���ļ�����ǰĿ¼�������ݿ�  
        SessionFactory sf=cfg.buildSessionFactory();
        Session sess=sf.openSession();
        sess.beginTransaction();
        admin person=new admin();
        person.setAccount("xixjinping");
        person.setPassword("123456");
        sess.save(person);  
        
        //�ύ����  
        sess.getTransaction().commit();  
        
	}

}
