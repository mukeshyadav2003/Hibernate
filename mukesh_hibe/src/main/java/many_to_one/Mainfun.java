package many_to_one;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Mainfun {

	public static void main(String[] args) {
		
		Address_table Adr = new Address_table();
		
		Adr.setStreetname("KanapathiNagar");
		Adr.setStreetno(1);
	
	
	
		Student student3 = new Student();
      
		student3.setName("yadav");
		student3.setAddress("MK");
		student3.setAdr(Adr);
	
	    Configuration c=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Address_table.class);
	    ServiceRegistry s= new StandardServiceRegistryBuilder().applySettings(c.getProperties()).build();
	    SessionFactory factory= c.buildSessionFactory(s);
	    Session session=factory.openSession();
	    Transaction trx=session.beginTransaction();
	    
	    try{
	    session.save(Adr);
	 
	    session.save(student3);
	    
	    trx.commit();}
	    catch(Exception e) {
	    	e.printStackTrace();
	    	trx.rollback();
	    }
	}

}
