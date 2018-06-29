package com.tharun;

import java.util.Scanner;

public class Employee {
  int eId;
  double eSalary;
  long eMobile;
  
  static Employee[] empArray = new Employee[4];
  public static void insertData()
  {
	  for(int i=0;i<=empArray.length-1;i++)
	  {
		  Employee emp = new Employee();
		  emp.eId=50+i;
		  emp.eSalary=2500*(5+i);
		  emp.eMobile=970042372+(i*2);
		  empArray[i]=emp;
	  }
  }
  public static void displayEmp()
  {
	  for(int i=0;i<=empArray.length-1;i++)
	  {
		  Employee emp = (Employee)empArray[i];
		  System.out.println("Id="+emp.eId+"Salary="+emp.eSalary+"Mobile="+emp.eMobile);
	  }
  }
  public static void displayOneEmp()
  {
<<<<<<< HEAD
<<<<<<< HEAD
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the input");
	  int temp = sc.nextInt();
	  for(int i=0;i<=empArray.length-1;i++) {
	  Employee emp = (Employee)empArray[i];
	 	   if(emp.eId==temp){
		 System.out.println(empArray[i]);
	   }
=======
=======
>>>>>>> bc09feb8e7a372955e03b8e6eef61594470168c0
	  
	 for(int i=0;i<=empArray.length-1;i++) {
	     Employee emp = (Employee)empArray[i];
	     
	     Scanner sc = new Scanner(System.in);
		 int empid = sc.nextInt();
	     if(empid==(50+i)){
		  System.out.println("Id="+emp.eId+"Salary="+emp.eSalary+"Mobile="+emp.eMobile);
	     }
	     else
	     {
	    	 System.out.println("No data Found");
	     }
<<<<<<< HEAD
>>>>>>> bc35308ec58aa9aa1c60b2f4fd9b10ebc96a9486
=======
>>>>>>> bc09feb8e7a372955e03b8e6eef61594470168c0
	 }
   }
  
  public static void main(String[] args){
	  insertData();
	  displayEmp();
	  displayOneEmp();
  }
}
 