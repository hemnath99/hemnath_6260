package mav.projectDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Configuration config= new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		
		Student obj=new Student(1,"aaa","A", "Chennai");
		
		session.save(obj);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
	}}
