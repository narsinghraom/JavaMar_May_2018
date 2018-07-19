package com.vtalent.sahithi;
import java.util.Scanner;
public class Employee1 {
	
     
	int eId;
	double eSalary;
	long eMobile;
	static Employee[] empArray=new Employee[4];
	public static void insertData(){
		for(int i=0;i<=empArray.length-1;i++)
		{
			Employee emp=new Employee();
			emp.eId=100+i;
			emp.eSalary=2500*(10+i);
			emp.eMobile=70754435+(i*2);
			empArray[i]=emp;
		}
	}
		public static void display()
		{
			for(int i=0;i<=empArray.length-1;i++)
			{
				Employee emp=(Employee)empArray[i];
				
			}}
		public static void displayone()
		{
			for(int i=0;i<=empArray.length-1;i++)
			{
				Employee emp=(Employee)empArray[i];
			Scanner sc=new Scanner(System.in);
			System.out.println("enter i value");
			int k=sc.nextInt();
			
		if(i==k)
		{
	System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile +empArray[i]);
		}
		else
		{
			System.out.println("no data");
		}
		}
			
		}
		
		public static void main(Strng args[])
		{
	     insertData();
	     display();
	     displayone();
	}
	}



