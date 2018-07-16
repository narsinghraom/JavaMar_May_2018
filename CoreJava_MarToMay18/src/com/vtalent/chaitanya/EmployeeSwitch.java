package src.com.vtalent.chaitanya;

import java.util.Scanner;

//import com.vtalent.chaitanya.Employee;

//import com.vtalent.chaitanya.Employee;

public class EmployeeSwitch {

	int eid;
	double esalary;
	long emobile;
	static EmployeeSwitch[] empArray = new EmployeeSwitch[5];

	public static void insertData() {
		for (int i = 0; i <= empArray.length - 1; i++) {
			EmployeeSwitch emp = new EmployeeSwitch();
			emp.eid = 100 + i;
			emp.esalary = 2500 * (10 + i);
			emp.emobile = 949498712 + (i * 2);
			empArray[i] = emp;

		}
	}

	public static void displayEmp() {
		for (int i = 0; i <= empArray.length - 1; i++) {

			EmployeeSwitch emp = (EmployeeSwitch) empArray[i];
			try {

				System.out.println("emp id= " + emp.eid);
				System.out.println("emp salary= " + emp.esalary);
				System.out.println("emp mobile= " + emp.emobile);
				System.out.print("\n");
			} catch (Exception e) {
				// System.out.println("Exception while trying to find length of
				// input : NULL "/*+e.toString()*/);
				System.out.println("emp id=Null ");
				System.out.println("emp salary=Null ");
				System.out.println("emp mobile= Null");
				System.out.print("\n");
			}
		}

	}

	public static void update() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter id: ");
		int tempEid = sc.nextInt();
		for (int i = 0; i <= empArray.length - 1; i++) {
			EmployeeSwitch emp = (EmployeeSwitch) empArray[i];
			if (tempEid == emp.eid) {
				System.out.println("eid: " + emp.eid);
				System.out.println("esalary: " + emp.esalary);
				System.out.println("emobile: " + emp.emobile);
				System.out.println("enter the salary to update: ");
				emp.esalary = sc.nextInt();
				empArray[i] = emp;
				System.out.println("updated salary: " + emp.esalary);
				break;

			}
		}
	}

	public static void displayOneEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id: ");
		int temp = sc.nextInt();
		for (int i = 0; i <= empArray.length - 1; i++) {
			EmployeeSwitch emp = (EmployeeSwitch) empArray[i];
			if (emp.eid == temp) {
				// Employee emp = (Employee)empArray[i];
				System.out.println("Id=" + emp.eid + "\n" + "Salary=" + emp.esalary + "\n" + "Mobile=" + emp.emobile);
				// System.out.println(empArray[i]);
			}
		}
	}
	

	public static void delete() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter id: ");
		int tempEid = sc.nextInt();
		for (int i = 0; i <= empArray.length - 1; i++) {
			EmployeeSwitch emp = (EmployeeSwitch) empArray[i];
			if (tempEid == emp.eid) {

				System.out.println("eid: " + emp.eid);
				System.out.println("esalary: " + emp.esalary);
				System.out.println("emobile: " + emp.emobile);
				empArray[i] = null;
				System.out.println(emp.eid);

				break;

			}
		}
	}

	public static void menu() {
		//Scanner in = new Scanner(System.in);
		// Display the menu
		System.out.println("1\t Insert Employee");
		System.out.println("2\t Update Employee");
		System.out.println("3\t Delete Employee");
		System.out.println("4\t Search Employee");
		System.out.println("5\t Display All Employee");
		System.out.println("6\t Exiting...");

		System.out.println("Please enter your choice:");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		 * // Display the menu System.out.println("1\t Insert Employee");
		 * System.out.println("2\t Update Employee"); System.out.println(
		 * "3\t Delete Employee"); System.out.println("4\t Search Employee");
		 * System.out.println("5\t Display All Employee");
		 * 
		 * 
		 * System.out.println("Please enter your choice:");
		 */

		// Get user's choice
		menu();
		int choice = in.nextInt();
		// boolean quit = false;
		insertData();
		// Display the title of the chosen module
		switch (choice) {
		case 1:
			insertData();
			break;
		case 2:
			update();

			break;
		case 3:
			delete();
			break;
		case 4:
			displayOneEmp();
			break;
		case 5:
			displayEmp();
			break;
		case 6:
			System.out.println("Exiting...");
			break;

		default:
			System.out.println("Invalid choice");
		}// end of switch

	}// end of the main method
	// end of class
}
