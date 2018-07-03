package com.vtalent.branch.sowmya;

	import java.util.Scanner;

	public class Employee 
	{
		int empid;
	   double empsal;
	   long emobile;
	  static Employee[] emparray=new Employee[5];

	public static void insertData()
	{
		for(int i=0;i<=emparray.length-1;i++)
		{
			Employee emp=new Employee();
			emp.empid=300+i;
			
		emp.empsal=10000*(5*i);
			emp.emobile=924696+(i*2);
			emparray[i]=emp;
		}
	}
	public static void displayData()
	{
		for(int i=0;i<=emparray.length-1;i++)
		{
			Employee emp=(Employee)emparray[i];
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the employee id");
			int empid=sc.nextInt();
			if(empid==300+i)
			{
				System.out.println(emp.empid+" "+emp.empsal+" "+emp.emobile);
			}
			else
			{
				System.out.println("Provide correct ID");
			}
		}}



		public static void main(String[] args) {
			
			insertData();
			displayData();
		}

	}



