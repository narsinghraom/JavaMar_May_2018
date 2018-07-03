package com.vtalent.swathi;

 import java.util.Scanner;

	  class ArraySal1
	  {
	               int eid;
	 			 double esalary;
	 			 long emobile;
	 			 static ArraySal1[] empArray=new ArraySal1[4];
	 			 public static void insertData()
	 			 {
	 				 for(int i=0;i<=empArray.length-1;i++)
	 				 {
	 					 ArraySal1 emp=new ArraySal1();
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
	 						 ArraySal1 emp=(ArraySal1)empArray[i];
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
		 					
	 					 ArraySal1 emp=(ArraySal1)empArray[i];
	 					 
	 					emp.esalary=temp;
	 					
	 					
	 						 System.out.println(emp.eid+" "+emp.esalary+" "+emp.emobile);
	 					 
	 					
	 					 
	 				 }

	 		}
	 				 public static void main(String[] args)
	 				 {
	 					 insertData();
	 					 displayEmp();
	 					 displayOne(); 
	 				 }
	 				
	  }


	  




