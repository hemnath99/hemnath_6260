package mav.projectDemo;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import com.entity.QuestionEntity;
import com.entity.AnswerEntity;

public class ManyToOneQA
{
  public static void main(String[] args) {
	  try
	  {
		  System.out.println("Hello World!");
		  Configuration cfg= new Configuration();
		  cfg.configure("hibernate.cfg.xml");
	  
		  SessionFactory sf= cfg.buildSessionFactory();
		  Session session = sf.openSession();
	  
		  QuestionEntity q1= new QuestionEntity(1, "What is JAVA?");
		  AnswerEntity a1= new AnswerEntity(101, "High Level Programming Language.");
		  AnswerEntity a2= new AnswerEntity(102, "Object Oriented Programming Language.");
	
		  List<AnswerEntity> list=new ArrayList<AnswerEntity>();
		  list.add(a1);
		  list.add(a2);
	
		  q1.setAnswer(list);
		  a1.setQuestion(q1);
		  a2.setQuestion(q1);
		  
		  session.saveOrUpdate(q1);
		  session.saveOrUpdate(a1);
		  session.saveOrUpdate(a2);
		  
		  Transaction t= session.beginTransaction();
		  t.commit();
		  }
		  catch(Exception e)
		  {
			  System.out.println("exception occured" +e);
		  }
		  System.out.println("Hello World!");	
}  
}

