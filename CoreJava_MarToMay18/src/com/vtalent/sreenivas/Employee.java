package com.vtalent.sreenivas;

import java.util.Scanner;

public class Employee {
int empid;
double empsal;
long emobile;
static Employee[] emparray=new Employee[2];
public static void insertData()
{
	for(int i=0;i<=emparray.length-1;i++)
	{
		Employee emp=new Employee();
		emp.empid=50+i;
		emp.empsal=20000*(5*i);
		emp.emobile=888633823+(i*2);
		emparray[1]=emp;
	}
}
public static void displayData()
{
	for(int i=0;i<=emparray.length-1;i++)
	{
		Employee emp=(Employee)emparray[1];
		System.out.println(emp.empid+" "+emp.empsal+" "+emp.emobile);
	}
}
public  void display()
{
	Scanner s=new Scanner(System.in);
	System.out.print("enter the employee id="+empid);
	int empid=s.nextInt();
	System.out.println("employee sal="+empsal);
	System.out.println("employee mobile="+emobile);
}
public static void main(String[] args)
{
	Employee e=new Employee();
	insertData();
	displayData();
	e.display();
	
}
}
