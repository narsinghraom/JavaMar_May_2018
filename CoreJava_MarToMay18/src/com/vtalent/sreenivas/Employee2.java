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
	  // String sql="select *from gopal1 where empid=101";
		String sql="update gopal1 set sal=sal+2500 where empid=101";
	   int rs=stmt.executeUpdate(sql);
	  Scanner s=new Scanner(System.in);
	   System.out.println("enter the empid");
	   int eid=s.nextInt();
	 System.out.println("one row is updated="+rs);
	   con.close();
	   stmt.close();
	   //rs.close();
	}

}
