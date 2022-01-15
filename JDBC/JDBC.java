package db;
import java.sql.*;
class Dbdemo
{
	public static void main(String args[])	{
		try
		{
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql:///sampledb","root","12345");
			Statement stmt = con.createStatement();
	    	                 //  Creating Table  //
			String query = "create table list(id int, name varchar(20))";
			stmt.executeUpdate(query);
			//  Inserting Elements  //
			String query1 = "insert into list(id,name) values(101,'Ravi')";
			int i = stmt.executeUpdate(query1);
			if(i>0)
			{
				System.out.println("Record inserted");
			}
			else{
				System.out.println("Error");
					}
					
			//  Inserting from user input //
			String query2 = "insert into list(id,name) values(?,?)";
			PreparedStatement pstmt = con.prepareStatement(query2);
			pstmt.setInt(1,103);
			pstmt.setString(2,"Kumar");
			int j = pstmt.executeUpdate();
			if(j>0)
			{
				System.out.println("Inserted");
			}
					
		
			
			//  Delete
			String str ="delete from list where id=101";
			PreparedStatement pstmts = con.prepareStatement(str);
			pstmts.execute();
			
			String query4 = "select id,name from list";
			ResultSet rsd = stmt.executeQuery(query4);
			while(rsd.next())
			{
			System.out.println("Id : "+rsd.getInt("id")+" Name : "+rsd.getString("name"));
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception has occured "+e);
		}
	}
}