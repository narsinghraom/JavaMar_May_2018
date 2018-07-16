package com.vtalent.sreenivas;

import java.util.Scanner;

public class Test
{
	static TestEmployeeEncapsulation[] test=new TestEmployeeEncapsulation[4];
	public static void insertData()
	{
		for(int i=0;i<=test.length-1;i++)
		{
			 TestEmployeeEncapsulation emp=new  TestEmployeeEncapsulation();
			emp.setEmpid(100+i);
			emp.setSalary(2500+(i*2));
			emp.setMobile(888633+(i*2));
			test[i]=emp;
			}
		displayData();
		}
	 public static void displayData()
	 {
		 for(int i=0;i<=test.length-1;i++)
		 {
			 if(null!=test[i]){
				 TestEmployeeEncapsulation emp=(TestEmployeeEncapsulation)test[i];
			 System.out.print("the data is displayed:");
			 System.out.println(emp.getEmpid()+" "+emp.getSalary()+" "+emp.getMobile());
			 }
		 }
	 }
	 public static void updateData()
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the employee id");
		 int empid=s.nextInt();
		 for(int i=0;i<=test.length-1;i++)
		 {
			 TestEmployeeEncapsulation emp=(TestEmployeeEncapsulation)test[i];
			 if(empid==emp.getEmpid())
			 {
				 System.out.println(emp.getEmpid()+" "+emp.getSalary()+" "+emp.getMobile());
				 System.out.println("enter the updated salary");
				 double sal=s.nextDouble();
				 emp.setSalary(sal);
				 test[i]=emp;
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
		 for(int i=0;i<=test.length-1;i++)
		 {
			 TestEmployeeEncapsulation emp=(TestEmployeeEncapsulation)test[i];
			 if(empid==emp.getEmpid())
			 {
				test[i]=null;
		        System.out.println("one employee is deleted");
		       displayData();
			 } 
			 }
		 }
	 public static void searchData()
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the employee id");
		 int empid1=s.nextInt();
		 for(int i=0;i<=test.length-1;i++)
		 {
			 if(null!=test[i]){
				 TestEmployeeEncapsulation emp=(TestEmployeeEncapsulation)test[i];
			if(emp.getEmpid()==empid1)
			 {
				 System.out.println(emp.getEmpid()+" "+emp.getSalary()+" "+emp.getMobile());
				 break;
		 }
			 }

		 }
		 //displayData();
	 }
	 public static void show()
	 {
		 System.out.println("exit the condition");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TestEmployeeEncapsulation test=new TestEmployeeEncapsulation();
		test.setEmpid(100);
		test.setSalary(35000.00);
		test.setMobile(888633);
		System.out.println(test.getEmpid()+" "+test.getMobile()+" "+test.getSalary());*/
System.out.println("options");
		
		System.out.println("1.insert employee");
		System.out.println("2.displayall employee");
		System.out.println("3.update employee");
		System.out.println("4.delete employee");
		System.out.println("5.search data");
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
				System.out.println("data is displayed");
				System.out.println("=============");
				break;}
			case 4:{
				deleteData();
				System.out.println("data is displayed");
				System.out.println("=============");
				break;}
			case 5:{
				searchData();
				System.out.println("data is displayed");
				System.out.println("=============");
				break;}
			case 6:{
				show();
				System.exit(0);
				System.out.println("no data is found");
			}

	}
		}
	}
}
