package com.vtalent.sreenivas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Employee2 
{
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sreenu");
		Statement stmt=con.createStatement();
	   String sql="select *from gopal1 where empid=101";
	   ResultSet rs=stmt.executeQuery(sql);
	  Scanner s=new Scanner(System.in);
	   System.out.println("enter the empid");
	   int eid=s.nextInt();
	   while(rs.next())
	   {
		   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5));
	   }
	   con.close();
	   stmt.close();
	   rs.close();
	}

}
