package com.vtalent.chaitanya;



	class Employee {
	int eid;
	double esalary;
	long emobile;
	static Employee[]empArray=new Employee[4];
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
			System.out.print("\n");
		}
		
	}
	public static void main(String[] args) {
		insertData();
		displayEmp();
	}
	}
