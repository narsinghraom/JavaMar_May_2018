package com.vtalent.revanth;

import java.util.Scanner;

class Employee {
	int eid;
	double esalary;
	long emobile;
	static Employee[] empArray = new Employee[5];

	public static void insertData() {
		for (int i = 0; i <= empArray.length - 1; i++) {
			Employee emp = new Employee();
			emp.eid = 100 + i;
			emp.esalary = 2500 * (10 + i);
			emp.emobile = 949498712 + (i * 2);
			empArray[i] = emp;

		}
	}

	public static void displayEmp() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter id: ");
		int tempEid = sc.nextInt();
		for (int i = 0; i <= empArray.length - 1; i++) {
			Employee emp = (Employee) empArray[i];
			if (tempEid == emp.eid) {
				System.out.println(emp.eid);
				System.out.println(emp.esalary);
				System.out.println(emp.emobile);
				break;

			}
		}
	}
	/*
	 * for(int i=0;i<=empArray.length-1;i++) { 
	 * Employee emp=(Employee)empArray[i];
	 * System.out.println("emp id= "+emp.eid);
	 * System.out.println("emp salary= "+emp.esalary);
	 * System.out.println("emp mobile= "+emp.emobile); } }
	 */
	public static void update() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter id: ");
		int tempEid = sc.nextInt();
		for (int i = 0; i <= empArray.length - 1; i++) {
			Employee emp = (Employee) empArray[i];
			if (tempEid == emp.eid) {
				System.out.println(emp.eid);
				System.out.println(emp.esalary);
				System.out.println(emp.emobile);
			System.out.println("enter the salary: ");
			emp.esalary=sc.nextInt();
			empArray[i]=emp;
				break;

			}}
		}
	public static void main(String[] args) {
		insertData();
		//displayEmp();
		update();
	}
}
