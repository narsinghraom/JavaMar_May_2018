package com.vtalent.branch.sowmya;

	import java.util.Scanner;

	public class Employee1 
	{
		int empid;
	   double empsal;
	   long emobile;
	  static Employee1[] emparray=new Employee1[5];

	public static void insertData()
	{
		for(int i=0;i<=emparray.length-1;i++)
		{
			Employee1 emp=new Employee1();
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
		
		
			Employee1 emp=(Employee1)emparray[i];
			System.out.println(emp.empid+" "+emp.empsal+" "+emp.emobile);
		}
	}
		public static void displayOne()
		{
			for(int i=0;i<=emparray.length-1;i++)
			{
			Scanner sc=new Scanner(System.in);
			System.out.println("update the salary for Employee1"+" "+i);
			int temp=sc.nextInt();
			Employee1 emp=(Employee1)emparray[i];
			emp.empsal=temp;
//	updating value		emparray[i]=emp;
//			emparray[i]=null;
				System.out.println(emp.empid+" "+emp.empsal+" "+emp.emobile);
			}
		}
			



		public static void main(String[] args) {
			
			insertData();
			displayData();
			displayOne();
		}

	}




