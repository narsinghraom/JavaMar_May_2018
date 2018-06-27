package com.vtalent.sreenivas;

import java.util.Scanner;

public class Employee1 
{
	int empid;
	String ename;
	double esal;
	int deptno;
	public void employeedata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the employee id");
		int empid=s.nextInt();
		System.out.println("enter the employee name");
		String ename=s.next();
		System.out.println("enter the employee esal");
		double esal=s.nextDouble();
		System.out.println("enter the employee deptno");
		int deptno=s.nextInt();
	}
	public void display()
	{
		System.out.println("the employee id is="+empid);
		System.out.println("enter the employee name="+ename);
		System.out.println("enter the employee esal="+esal);
		System.out.println("enter the employee deptno="+deptno);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e=new Employee1();
		e.employeedata();
		e.display();

	}

}
