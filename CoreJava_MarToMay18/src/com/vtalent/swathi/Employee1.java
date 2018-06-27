package com.vtalent.swathi;


import java.util.*;
	 class Employee1 {
		 int eid;
		 double esalary;
		 long emobile;
		 static Employee1[] empArray=new Employee1[4];
		 public static void insertData()
		 {
			 for(int i=0;i<=empArray.length-1;i++)
			 {
				 Employee1 emp=new Employee1();
				 emp.eid=100+i;
				 emp.esalary=2500*(10+i);
				 emp.emobile=789383+(i*2);
				 empArray[i]=emp;
			 }
		 }
			 public static void main(String args[])
			 {
				 insertData();
				 displayEmp();
				 Scanner sc=new Scanner(System.in);
				 
				 System.out.println("enter the input");
				 int ch=sc.nextInt();
				 displayOne(ch);
				 
		 }
			 public static void displayEmp()
			 {
				 for(int i=0;i<=empArray.length-1;i++)
				 {
			 Employee1 emp=(Employee1)empArray[i];
			 System.out.println("id="+emp.eid+"salary="+emp.esalary+"mobile="+emp.emobile);
			 
				 
				 }
	 }
			 public static void displayOne(int i)
			 {
				 
				 Employee1 emp=(Employee1)empArray[i];
				 
				 
					 System.out.println(emp.eid+" "+emp.esalary+" "+emp.emobile);
				 
			 }

	}



