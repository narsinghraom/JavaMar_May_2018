package com.vtalent.maheshreddy;

public class ArrayEmployee {
	int empid;
	double esal;
	long emobile;

	static ArrayEmployee[] empArray = new ArrayEmployee[4];

	public static void insertData() {
		for (int i = 0; i <= empArray.length - 1; i++) {
			ArrayEmployee e = new ArrayEmployee();
			e.empid = 100 + i;
			e.esal = 2500 * (10 + i);
			e.emobile = 8484848 + (i * 2);
			empArray[i] = e;
		}
	}

	public static void disp() {
		for (int i = 0; i <= empArray.length - 1; i++) {
			ArrayEmployee emp = (ArrayEmployee) empArray[i];

			System.out.println("employeeid=" + emp.empid + "empsal=" + emp.esal + "empmobile=" + emp.emobile);
		}
	}

	public static void main(String[] args) {
		insertData();
		disp();
	}
}
