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
        ////生成并输出sql到文件（当前目录）和数据库  
        SessionFactory sf=cfg.buildSessionFactory();
        Session sess=sf.openSession();
        sess.beginTransaction();
        admin person=new admin();
        person.setAccount("xixjinping");
        person.setPassword("123456");
        sess.save(person);  
        
        //提交事务  
        sess.getTransaction().commit();  
        
	}

}
