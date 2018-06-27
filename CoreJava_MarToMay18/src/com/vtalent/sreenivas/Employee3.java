package com.vtalent.sreenivas;

import java.util.Scanner;

public class Employee3
{
	int empid;
	double empsal;
	long emobile;
	static Employee[] emparray=new Employee[3];
	
	public static void insertData()
	{
		for(int i=0;i<=emparray.length-1;i++)
		{
			Employee emp=new Employee();
			emp.empid=50+i;
			//emp.empsal=20000*(5*i);
			emp.empsal=20000*(5*i)+2000;
			emp.emobile=888633823+(i*2);
			emparray[i]=emp;
		}
	}
	public static void displayData()
	{
		for(int i=0;i<=emparray.length-1;i++)
		{
			Employee emp=(Employee)emparray[i];
			
			Scanner s=new Scanner(System.in);
			System.out.println("enter the employee id");
			int empid=s.nextInt();
			if(emp.empid==50+i)
			{
				System.out.println(emp.empid+" "+emp.empsal+" "+emp.emobile);
			}
			else
			{
				System.out.println("no data found");
			}
		}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertData();
		displayData();

	}

}
