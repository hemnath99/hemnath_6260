package db;

import java.sql.*;
import java.util.Scanner;

class Newdb {
	public static void main(String []args) {
		try {
		
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql:///sampledb","root","12345");
					Statement stmt = con.createStatement();
					
		     		                //  Creating Table  //
					String query = "create table t2(id int, name varchar(20), age int, game varchar(10))";
					stmt.executeUpdate(query);
					
					//  Inserting from user input //
					 for(int i=0;i<5;i++) {
						String query2 = "insert into empl(id,name,dept,salary) values(?,?,?,?)";
						PreparedStatement pstmt = con.prepareStatement(query2);
					 
						Scanner sc=new Scanner(System.in);
					
						System.out.println("Enter id :");              int id=sc.nextInt();                      pstmt.setInt(1,id);
						System.out.println("Enter name :");        String name=sc.next();               pstmt.setString(2,name);
						System.out.println("Enter dept :");          String dept=sc.next();                   pstmt.setString(3,dept);
						System.out.println("Enter salary :");      String game=sc.next();            pstmt.setString(4,game);
						
					
						int j = pstmt.executeUpdate();
						if(j>0)  {   System.out.println("Inserted");  }
						else { System.out.println("error"); }
					    }
					String query4 = "select id,name,age,game from t2";
					ResultSet rsd = stmt.executeQuery(query4);
					while(rsd.next())
					{
					System.out.println(""+rsd.getInt("id")+" Name : "+rsd.getString("name")+" "+rsd.getInt("age")+" "+rsd.getString("game"));
					}
		} 
		catch(Exception e){
			System.out.println("exception "+e);
		}
	}
}
