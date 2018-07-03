package src.com.vtalent.chaitanya;

import java.util.Scanner;

public class UpdateEmployee {

	int eid;
	double esalary;
	long emobile;
	static Employee[] empArray = new Employee[100];

	public static void insertData() {
		for (int i = 0; i <= empArray.length - 1; i++) {
			Employee emp = new Employee();
			emp.eid = 100 + i;
			emp.esalary = 2500 * (10 + i);
			emp.emobile = 949498712 + (i * 2);
			empArray[i] = emp;

		}
	}

	/*public static void displayEmp() {
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
	}*/

	/*
	 * for(int i=0;i<=empArray.length-1;i++) { Employee emp=(Employee)empArray[i];
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
				System.out.println("eid: "+emp.eid);
				System.out.println("esalary: "+emp.esalary);
				System.out.println("emobile: "+emp.emobile);
				System.out.println("enter the salary to update: ");
				emp.esalary = sc.nextInt();
				empArray[i] = emp;
				System.out.println("updated salary: "+emp.esalary);
				break;

			}
		}
	}
	/*public static void delete() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter id: ");
		int tempEid = sc.nextInt();
		for (int i = 0; i <= empArray.length - 1; i++) {
			Employee emp = (Employee) empArray[i];
			if (tempEid == emp.eid) {
				System.out.println("eid: "+emp.eid);
				System.out.println("esalary: "+emp.esalary);
				System.out.println("emobile: "+emp.emobile);
				empArray[i] = null;
				System.out.println(emp.eid);
				break;

			}
		}
	}*/
	

	public static void main(String[] args) {
		insertData();
		// displayEmp();
		update();
	//delete();
	}
}
