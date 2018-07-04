package com.vtalent.saikrishna;

public class Test {

	public static void main(String[] args) 
	{
		EncapsulationPrg ep=new EncapsulationPrg();
		ep.setEmpid(1122);
		ep.setEmpName("sai");
		ep.setEmpsal(5000);
		
		System.out.println("employee id="+ep.getEmpid());
		System.out.println("employee name="+ep.getEmpName());
		System.out.println("employee salary="+ep.getEmpsal());
	}
}
