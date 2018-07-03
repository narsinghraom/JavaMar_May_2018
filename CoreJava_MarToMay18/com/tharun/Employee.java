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
		  emp.eId=100+i;
		  emp.eSalary=2500*(10+i);
		  emp.eMobile=970042372+(i*2);
		  empArray[i]=emp;
	  }
  }
  public static void displayEmp()
  {
	  for(int i=0;i<=empArray.length-1;i++)
	  {
		  
		  if(null!=empArray[i]) {
			  Employee emp = (Employee)empArray[i];
			  System.out.println("Id="+emp.eId+"Salary="+emp.eSalary+"Mobile="+emp.eMobile);  
		  }
		  
	  }
  }
  public static void displayOneEmp()
  {    
	  Scanner sc = new Scanner(System.in);
	  int tempEid = sc.nextInt();
	 for(int i=0;i<=empArray.length-1;i++) {
		 if(null!=empArray[i]){
	     Employee emp = (Employee)empArray[i];
	     
	     if(tempEid==emp.eId){
		  System.out.println("Id="+emp.eId);
		  System.out.println("Salary="+emp.eSalary);
		  System.out.println("Mobile="+emp.eMobile);
		  break;
	     }
	     /*else
	    	 System.out.println("No data found");*/
		 }
	  }
   }
  
  public static void updateSalaryEmp()
  {    
	  Scanner sc = new Scanner(System.in);
	  int tempEid = sc.nextInt();
	 for(int i=0;i<=empArray.length-1;i++) {
		 if(null!=empArray[i]){
	     Employee emp = (Employee)empArray[i];
	     
	     if(tempEid==emp.eId){
		  System.out.println("Id="+emp.eId);
		  System.out.println("Salary="+emp.eSalary);
		  System.out.println("Mobile="+emp.eMobile);
		  emp.eSalary=sc.nextDouble();
		  empArray[i]=emp;
		  System.out.println("Id="+emp.eId+"Salary="+emp.eSalary+"Mobile="+emp.eMobile);
		  break;
	     }
	   }
	 }
   }
  public static void deleteEmp()
  {    
	  Scanner sc = new Scanner(System.in);
	  int tempEid = sc.nextInt();
	 for(int i=0;i<=empArray.length-1;i++) {
	     Employee emp = (Employee)empArray[i];
	     
	     if(tempEid==emp.eId){
		  /*System.out.println("Id="+emp.eId);
		  System.out.println("Salary="+emp.eSalary);
		  System.out.println("Mobile="+emp.eMobile);*/
		  empArray[i]=null;
		  //System.out.println(empArray[i]);
		  break;
	     }
	 }
	 displayEmp();
   }
  
  public static void main(String[] args){
	  /*insertData();
	  displayEmp();
	  displayOneEmp();
	  updateSalaryEmp();
	  deleteEmp();*/

	  Scanner sc = new Scanner(System.in);
	  for(int k=1;k!=6?true:false;)
	  {

		  System.out.println("Options");
		  
		  System.out.println("1.Insert employee");
		  System.out.println("2.Update employee");
		  System.out.println("3.Delete employee");
		  System.out.println("4.search employee");
		  System.out.println("5.display employee");
		  System.out.println("6.Exit employee");
		  System.out.println("Select any options");
		  int value = sc.nextInt();
		  switch(value)
		  {
		  case 1:
		      insertData();
		      System.out.println("Data is inserted:");
		      break;
		  case 2:
			  updateSalaryEmp();
			  break;
		  case 3:
			  deleteEmp();
			  break;
		  case 4:
			  displayOneEmp();
			  break;
		  case 5:
			  displayEmp();
			  break;
		  default:
			  k=6;
			  System.out.println("Exit");
		  }
	  }
  }
}
 