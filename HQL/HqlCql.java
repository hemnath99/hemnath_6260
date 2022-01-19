package mav.projectDemo;

import org.hibernate.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.*;

import com.entity.Employee;

public class HqlCql 
{
	public static void main(String[] args) {
		try {
		System.out.println("Hello World!");
		 Configuration cfg= new Configuration();
		  cfg.configure("hibernate.cfg.xml");
	  
		  SessionFactory sf = cfg.buildSessionFactory();
		  Session session = sf.openSession();
		/*
			Employee emp1=new Employee(1,"AAA",15000);
			Employee emp2=new Employee(2,"BBB",15000);
			Employee emp3=new Employee(3,"CCC",25000);
			Employee emp4=new Employee(4,"DDD",10000);
			Employee emp5=new Employee(5,"EEE",25000);
			session.saveOrUpdate(emp1);
			session.saveOrUpdate(emp2);
			session.saveOrUpdate(emp3);
			session.saveOrUpdate(emp4);
			session.saveOrUpdate(emp5);   */
		  
		  Transaction tx=session.beginTransaction();
	 
		  
		 /* String hql="From Employee ";
		  Query query=session.createQuery(hql);
		  List result = query.list();
		  System.out.println(result); */
		 /* 
		  Query query=session.createQuery("Delete from Employee where id=2");
          query.executeUpdate(); */
		  /*
		  String hql ="From Employee where id=1";
		  Query query=session.createQuery(hql);
		  List result=query.list();
		  System.out.println(result); */
		  /*
		  String hql="From Employee As E";
		  Query query=session.createQuery(hql);
		  List result=query.list();
		  System.out.println(result); */
		  
		  Criteria ctr=session.createCriteria(Employee.class);
	//	  ctr.add(Restrictions.gt("salary", 12000));
	//	  ctr.addOrder(Order.asc("salary"));
		  ctr.setProjection(Projections.rowCount());
		  List result=ctr.list();
		  System.out.println(result); 
		  
		/*  Employee emp=session.load(Employee.class,1);
		  System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());    */
		  
		  
		  //  As  //
	/*	  String hql = "FROM Employee As E";
		  Query query = session.createQuery(hql);
		  List results = query.list(); 
		  System.out.println(results);   */
		  
		  /*
		  String hql = "SELECT E.name FROM Employee E";
		  Query query = session.createQuery(hql);
		  List results = query.list(); 
		  System.out.println(results);  */
		  
		/*  String hql="From Employee";
		  Query query=session.createQuery(hql);
		  List<Employee> list=query.list();  
		  for(Employee listobj : list) {
			  System.out.println(listobj);
		  }*/
		
		  /*
		  String hql = "FROM Employee E WHERE E.id = 1";
		  Query query = session.createQuery(hql);
		  List results = query.list();
		  System.out.println(results);   */
		  
		  // Update //
		  /*
		  Query q=session.createQuery("update Employee set name=:n where id=:i");
		  q.setParameter("n","Udit");
		  q.setParameter("i",2);
		  int status=q.executeUpdate();
		  System.out.println(status);   */
		  
		  //  Delete  //
		 /* Query query=session.createQuery("delete from Employee where id=1");
		  query.executeUpdate();    */
		 
		  // Criteria //
	/*	  Criteria cr = session.createCriteria(Employee.class);
	//	  cr.add(Restrictions.gt("salary", 12000));
   //	  cr.addOrder(Order.desc("salary"));
	//	  cr.addOrder(Order.asc("salary"));
		  
		  cr.setProjection(Projections.property("name"));
		  List results = cr.list();
		  System.out.println(results);  */
	
		  tx.commit();
		  session.close();
		  
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Hello World");
	}
}