package com.vtalent.swathi;

import java.util.Scanner;

public class Vtalent
{
	  int eid;
		 double esalary;
		 long emobile;
		 static ArraySal[] empArray=new ArraySal[4];
		 public static void insertData()
		 {
			 for(int i=0;i<=empArray.length-1;i++)
			 {
				 ArraySal emp=new ArraySal();
				 emp.eid=100+i;
				 emp.esalary=2500*(10+i);
				 emp.emobile=789383+(i*2);
				 empArray[i]=emp;
			 }
		 }
		 
			 
				  
			 
			 public static void displayEmp()
			 {
				 for(int i=0;i<=empArray.length-1;i++)
				 {
					 ArraySal emp=(ArraySal)empArray[i];
			 System.out.println("id="+emp.eid+"salary="+emp.esalary+"mobile="+emp.emobile);
			 
				 
				 }
	 }
			 public static void displayOne()
			 {
				 for(int i=0;i<=empArray.length-1;i++)
				 {
					 Scanner sc=new Scanner(System.in);
					 System.out.println("update the salary for employee"+" "+i);
					 int temp=sc.nextInt();
					
				 ArraySal emp=(ArraySal)empArray[i];
				 
				emp.esalary=temp;
				
				
					 System.out.println(emp.eid+" "+emp.esalary+" "+emp.emobile);
				 
				
				 
			 }

	}

	public static void main(String[] args)
	{
		insertData();
		 displayEmp();
		displayOne();
		// TODO Auto-generated method stub

	}

}
