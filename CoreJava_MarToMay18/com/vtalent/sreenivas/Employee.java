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
		emparray[i]=emp;
	}
}
/*public static void display()
{
	Employee emp=new Employee();
	Scanner s=new Scanner(System.in);
	System.out.println("enter the employee id");
	int empid=s.nextInt();
	if(emp.empid==51)
	{
		System.out.println(emp.empid+" "+emp.empsal+" "+emp.emobile);
	}
	else
	{
		System.out.println("no data found");
	}
}*/
public static void displayData()
{
	for(int i=0;i<=emparray.length-1;i++)
	{
		Employee emp=(Employee)emparray[i];
		//System.out.println(emp.empid+" "+emp.empsal+" "+emp.emobile);
/*if(emp.empid==51)
{
	System.out.println(emp.empid+" "+emp.empsal+" "+emp.emobile);
}
else
{
	System.out.println("no data found");
}*/
		Scanner s=new Scanner(System.in);
		System.out.println("enter the employee id");
		int empid=s.nextInt();
		if(emp.empid==50)
		{
			System.out.println(emp.empid+" "+emp.empsal+" "+emp.emobile);
		}
		else
		{
			System.out.println("no data found");
		}
}
}
/*public  void display()
{
	Scanner s=new Scanner(System.in);
	System.out.print("enter the employee id="+empid);
	int empid=s.nextInt();
	System.out.println("employee sal="+empsal);
	System.out.println("employee mobile="+emobile);
}*/
public static void main(String[] args)
{
	Employee e=new Employee();
	insertData();
	displayData();
	//e.display();
	
}
}
