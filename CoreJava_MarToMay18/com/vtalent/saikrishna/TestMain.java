package com.vtalent.saikrishna;

public class TestMain {

	public static void main(String[] args) 
	{
		FirstInheritancePrg f1=new FirstInheritancePrg();
		f1.function(2);
		System.out.println(f1.i);
		System.out.println(f1.j);
		
		 SecondInheritancePrg f2=new SecondInheritancePrg();
		 f2.function(3);
		 f2.function(f1.i,f1.j);
	 System.out.println(f2.i+" "+f2.j);
		 System.out.println(f1.i+" "+f1.j);
	}

}
