package com.vtalent.saikrishna;

public class ExampleTest {

	public static void main(String[] args) 
	{
		Example e1=new Example1();
		e1.function(2);
		//System.out.println(e1.i);//2
		
		e1.function(2, 5);
		System.out.println(e1.i);
		System.out.println(e1.j);//7
	}
}
