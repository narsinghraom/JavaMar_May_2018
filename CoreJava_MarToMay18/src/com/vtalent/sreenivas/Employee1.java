package com.vtalent.sreenivas;

import java.util.Scanner;

public class Employee1 
{
	int empid;
	String ename;
	double esal;
	int deptno;
Employee1()
{
	empid=101;
	ename="sreenu";
	esal=25000.00;
	deptno=10;
	
}
public void display()
{
	System.out.println("the emp id is="+empid);
	System.out.println("the emp name is="+ename);
	System.out.println("the emp sal is="+esal);
	System.out.println("the emp deptno is="+deptno);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e=new Employee1();
		e.display();
		/*e.employeedata();
		e.display();
*/
	}

}
