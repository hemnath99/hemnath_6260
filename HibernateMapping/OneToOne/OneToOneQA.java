package mav.projectDemo;

import org.hibernate.*;
import org.hibernate.cfg.*;
import com.entity.Answer;
import com.entity.Question;

public class OneToOneQA
{
  public static void main(String[] args) {
	  try
	  {
		  System.out.println("Hello World!");
  
	  Configuration cfg= new Configuration();
	  cfg.configure("hibernate.cfg.xml");
	  
	  SessionFactory sf= cfg.buildSessionFactory();
	  
	  Session session = sf.openSession();
	 
	  Question obj= new Question();
	  obj.setId_q(100);
	  obj.setQuestion(" what day is today?");
	 
	  Answer obj1= new Answer();
	  obj1.setAnswer("Monday");
	  obj1.setId_a(1);
	  
	  obj.setAnswer(obj1);
	  obj1.setQuestion(obj);
	  
	  session.saveOrUpdate(obj);
	  session.saveOrUpdate(obj1);
	  
	  Transaction t= session.beginTransaction();
	  t.commit();
	  }
	  catch(Exception e)
	  {
		  System.out.println("excep occured" +e);
	  }
	  System.out.println("Hello World!");	
}  
}
