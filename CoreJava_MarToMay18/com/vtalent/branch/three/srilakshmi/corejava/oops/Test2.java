package com.vtalent.branch.three.srilakshmi.corejava.oops;

public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleThree e1= new ExampleThree();
		ExampleTwo e2= new ExampleTwo();
		int i=e2.function(2, 1.5f);
		float f1=e2.function((float)i);
		e2.function(i);
		System.out.println(f1);
		System.out.println(e2.i);
	    System.out.println(e2.j);
	    System.out.println(i);
		System.out.println(e1.i);
		System.out.println(e1.j);

		

	}

}
