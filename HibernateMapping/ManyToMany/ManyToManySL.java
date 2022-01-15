package mav.projectDemo;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import com.entity.Products;
import com.entity.Users;


class ManyToManySL {
	public static void main(String[] args) {
		  try
		  {
			  System.out.println("Hello World!");
			  Configuration cfg= new Configuration();
			  cfg.configure("hibernate.cfg.xml");
		  
			  SessionFactory sf= cfg.buildSessionFactory();
			  Session session = sf.openSession();
			  

		    	Users user1 = new Users();
		    	user1.setUserId(1);
		    	user1.setUserName("Shalini");
		    	
		    	Users user2 = new Users();
		    	user2.setUserId(2);
		    	user2.setUserName("vinothini");
		    	
		    	List<Users>userlist = new  ArrayList <Users>();
		    	userlist.add(user1);
		    	userlist.add(user2);

		    	
		    	Products product1 = new Products();
		    	product1.setProductId(100);
		    	product1.setProductName("mobile phones");
		    	product1.setUser(userlist);
		    	
		    	Products product2 = new Products();
		    	product2.setProductId(101);
		    	product2.setProductName("Laptop");
		    	product2.setUser(userlist);
		    	
		    	Products product3 = new Products();
		    	product3.setProductId(102);
		    	product3.setProductName("Laptop");
		    	product3.setUser(userlist);
		       
		        List<Products>productlist = new ArrayList<Products>();
		        productlist.add(product1);
		        productlist.add(product2);
		        productlist.add(product3);
		        
		        user1.setProducts(productlist);
		        user2.setProducts(productlist);

		        session.save(user1);
		        session.save(user2);
		        session.save(product1);
		        session.save(product2);
		        session.save(product3);
		        Transaction trans=session.beginTransaction();
		        trans.commit();
		    	}
		    	catch(Exception e)
		    	{
		    		System.out.println("Exception occured"+e);
		    	}
		        
		        

		    }
}
