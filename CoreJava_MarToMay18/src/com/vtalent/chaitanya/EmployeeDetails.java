package com.vtalent.chaitanya;

import java.util.Scanner;
public class EmployeeDetails {
		int eid;
		double esalary;
		long emobile;
		static Employee[]empArray=new Employee[100];
		public static void insertData()
		{
			for(int i=0;i<=empArray.length-1;i++) {
				Employee emp=new Employee();
				emp.eid=100+i;
				emp.esalary=2500*(10+i);
				emp.emobile=949498712+(i*2);
				empArray[i]=emp;
			
			}
		}
		public static void displayEmp() {
			for(int i=0;i<=empArray.length-1;i++) {
				Employee emp=(Employee)empArray[i];
				
				System.out.println("emp id= "+emp.eid);
				System.out.println("emp salary= "+emp.esalary);
				System.out.println("emp mobile= "+emp.emobile);
			}
			for(int i=0;i<=empArray.length-1;i++)
			  {
				 String newLine = System.getProperty("line.separator");
				  Employee emp = (Employee)empArray[i];
				  System.out.println("Id="+emp.eid+ newLine + "Salary="+emp.esalary+ newLine + "Mobile="+emp.emobile);
				  
			  }

		}
		public static void displayOneEmp()
		  {
			  Scanner sc = new Scanner(System.in);
			  int temp = sc.nextInt();
			  for(int i=0;i<=empArray.length-1;i++) {
			  Employee emp = (Employee)empArray[i];
			 	   if(emp.eid==temp){
			 		  //Employee emp = (Employee)empArray[i];
			 		  System.out.println("Id="+emp.eid+ "\n"+ "Salary="+emp.esalary+ "\n"+ "Mobile="+emp.emobile);
				 //System.out.println(empArray[i]);
			   }
			 }
		  }
		public static void main(String[] args) {
			insertData();
			//displayEmp();
			 //Scanner sc = new Scanner(System.in);
			  //int temp = sc.nextInt();
			displayOneEmp();
		}
		}


