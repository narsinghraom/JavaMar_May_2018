package com.vtalent.branch.three.srilakshmi.corejava.oops;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e1=Example.function(2);
		float f1=e1.function(1.5f);
		System.out.println(f1);
		System.out.println(e1.i);
	    System.out.println(e1.j);
	    ExampleOne e2=new  ExampleOne();
	    int i=e2.function(e1.i, f1);
		System.out.println(i);
		System.out.println(e2.i);
		System.out.println(e2.j);

		

	}

}
