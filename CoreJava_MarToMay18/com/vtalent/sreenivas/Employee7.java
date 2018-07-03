package com.vtalent.sreenivas;

import java.util.Scanner;

public class Employee7 
{
	int empid;
	double salary;
	long mobile;
	static Employee7[] emparray=new Employee7[4];
	public static void insertData()
	{
		for(int i=0;i<=emparray.length-1;i++)
		{
			Employee7 emp=new Employee7();
			emp.empid=100+i;
			emp.salary=2500+(i*2);
			emp.mobile=888633+(i*2);
			emparray[i]=emp;
		}
	}
 public static void displayData()
 {
	 for(int i=0;i<=emparray.length-1;i++)
	 {
		 Employee7 emp=(Employee7)emparray[i];
		 System.out.print("the data is displayed:");
		 System.out.println(emp.empid+" "+emp.salary+" "+emp.mobile);
	 }
 }
 public static void updateData()
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the employee id");
	 int empid=s.nextInt();
	 for(int i=0;i<=emparray.length-1;i++)
	 {
		 Employee7 emp=(Employee7)emparray[i];
		 if(empid==emp.empid)
		 {
			 System.out.println(emp.empid+" "+emp.salary+" "+emp.mobile);
			 System.out.println("enter the updated salary");
			 double sal=s.nextInt();
			 emp.salary=sal;
			 emparray[i]=emp;
			 System.out.println("the salary is updated");
			 displayData();
			 break;
		 }
	 }
 }
 public static void deleteData()
 {
	 Scanner s=new Scanner(System.in);
	System.out.println("enter the employee id");
	 int empid=s.nextInt();
	 for(int i=0;i<emparray.length-1;i++)
	 {
		 Employee7 emp=(Employee7)emparray[i];
		 if(empid==emp.empid)
		 {
			/*System.out.println("the employee id is:"+emp.empid);
			System.out.println("the employee salary is:"+emp.salary);
			System.out.println("the employee mobile is:"+emp.mobile);*/
			//System.out.println("print the empsalary and mobile is:"+emp.salary+" "+emp.mobile);
	       emparray[i]=null;
	        System.out.println("one employee is deleted");
	        System.out.println("the employee id is:"+emp.empid);
			System.out.println("the employee salary is:"+emp.salary);
			System.out.println("the employee mobile is:"+emp.mobile);
	       //displayData();
		 } 
		 }
	 }
 public static void searchData()
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the employee id");
	 int empid1=s.nextInt();
	 for(int i=0;i<emparray.length-1;i++)
	 {
		 Employee7 emp=(Employee7)emparray[i];
		 //if(emp.empid==103)
		 //{
			// System.out.println(emp.empid+" "+emp.salary+" "+emp.mobile);
	// }

	 }
	 //displayData();
 }
 public static void show()
 {
	 System.out.println("exit the condition");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("options");
		
		System.out.println("1.insert employee");
		System.out.println("2.update employee");
		System.out.println("3.delete employee");
		System.out.println("4.search employee");
		System.out.println("5.displayall employee");
		System.out.println("6.exit employee");
		
		Scanner s=new Scanner(System.in);
		for(int k=0;k<=5;k++)
		{
			System.out.println("select the your option");
			int option=s.nextInt();
			switch(option)
			{
			case 1:
			{ 
				insertData();
				System.out.println("data inserted");
				System.out.println("==============");
			break;}
			case 2:{
				displayData();
				System.out.println("data is displayed");
				System.out.println("=============");
				break;}
			case 3:{
				updateData();
				System.out.println("data is updated");
				System.out.println("==============");
				break;
			}
			case 4:{
				deleteData();
				System.out.println("data is deleted");
				System.out.println("=================");
				break;
			}
			case 5:{
				searchData();
				System.out.println("searching the data is completed");
				System.out.println("===================");
				break;
			}
			case 6:{
				show();
				System.exit(0);
				System.out.println("no data is found");
			}
			}
		}

	}

}
