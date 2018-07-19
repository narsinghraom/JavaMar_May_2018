package com.vtalent.ranjith;

public class Test {
	public static void main(String[] args) {
		Encapsulation enc=new Encapsulation();	
	enc.setEmpId(101);
	enc.setEmpName("ranjith");
	enc.setEmpSal(234.56);
	
	System.out.println("Employee Id="+enc.getEmpId());
	System.out.println("Employee Name="+enc.getEmpName());
	System.out.println("Employee salary="+enc.getEmpSal());
	
	}
	
	

}
