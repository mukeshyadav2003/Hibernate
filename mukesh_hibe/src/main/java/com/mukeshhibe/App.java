package com.mukeshhibe;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
	public static void saved(int id,String name,int rollno) {
		
  	  long course=0;
             Schools sch = new Schools();

             sch.setId(id);
             sch.setName(name);
             sch.setRollno(rollno);
             Configuration c=new Configuration().configure();
             c.configure("hibernate.cfg.xml");
             SessionFactory factory = c.buildSessionFactory();
             Session session =factory.openSession();
             Transaction trx=session.beginTransaction();
           
             session.save(sch);
             trx.commit();
      	     session.close();
             System.out.println("Succefully Run");
            
       
             }
            
	public static void updated(int id,String name,int rollno) {
		
		Configuration c= new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory=c.buildSessionFactory();
		Session session= factory.openSession();
		Transaction trx = session.beginTransaction();
		
		Schools sch = (Schools) session.get(Schools.class,id);
		sch.setId(id);
		sch.setName(name);
		sch.setRollno(rollno);
	}
	
	
	public static void display() {
		
		
		Configuration c= new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory=c.buildSessionFactory();
		Session session= factory.openSession();
		Transaction trx = session.beginTransaction();
		
		List detail = session.createQuery("from Schools").list();
		for(Iterator iterator=detail.iterator();iterator.hasNext();) {
			
			Schools school=(Schools) iterator.next();
			System.out.println(school.getName());
		}
	}
	
    public static void main( String[] args )
    {
    	
        Scanner scan= new Scanner(System.in);
        System.out.println("1 to save , 2 to update,3 to delete,4 to list");
    	int key=scan.nextInt();
        
        switch(key) {
        
        case 1:
        	System.out.println("Enter id :");
        	int id = scan .nextInt();
        	System.out.println("Enter Name :");
        	String name=scan.next();
        	System.out.println("Enter rollNo :");
        	int rollno = scan.nextInt();
        	
        	App.saved(id,name,rollno);
        	break;
        case 2:
    	        	    
        	System.out.println("Enter id :");
          	int id1 = scan .nextInt();
          	System.out.println("Enter Name :");
          	String name1=scan.next();
          	System.out.println("Enter rollNo :");
          	int rollno1 = scan.nextInt();
          	
          	App.updated(id1,name1,rollno1);
          	break;
          	
            case 3:
        	
        	App.display();
    	    break;
        }
        
        
    	
        
            	  
    }
               
           }

