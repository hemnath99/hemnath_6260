package mav.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.bean.Student;


public class App 
{
    public static void main( String[] args )
    {
    	try 
    	{
        System.out.println( "Hello World !" );
        
        ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
        
      
        Student std=con.getBean(Student.class,"std1");
        System.out.println("\n"+std +" "+std.getPlace());
        
        System.out.println("\nEmployee");
        Employee emp=con.getBean(Employee.class,"emp1");
        System.out.println(emp.getId()+"\n"+emp.getName()+"\n"+emp.getDept()+"\n"+emp.getEmail()+"\n"+emp.getDictionary());  
        System.out.println(emp.getPlace());
        }
    	catch(Exception e) 
    	{ 
    		System.out.println("Exception" +e);
    	}
    }
}
