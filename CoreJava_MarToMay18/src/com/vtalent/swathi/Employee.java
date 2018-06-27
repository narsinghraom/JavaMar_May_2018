package com.vtalent.swathi;

 class Employee {
	 int eid;
	 double esalary;
	 long emobile;
	 static Employee[] empArray=new Employee[4];
	 public static void insertData()
	 {
		 for(int i=0;i<=empArray.length-1;i++)
		 {
			 Employee emp=new Employee();
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
	 }
		 public static void displayEmp()
		 {
			 for(int i=0;i<=empArray.length-1;i++)
					 {
				 Employee emp=(Employee)empArray[i];
				 System.out.println("id="+emp.eid+"salary="+emp.esalary+"mobile="+emp.emobile);
				 
					 
					 }
		 }

}
