package com.vtalent.sreenivas;

public class InheritanceTest {

	public static void main(String[] args) 
	{	
		// TODO Auto-generated method stub
		InheritanceFirst f1=new InheritanceFirst();
		f1.function(2);
		System.out.println(f1.i);
		System.out.println(f1.j);
		InheritanceSecond f2=new InheritanceSecond();
		//f2.function(3);
		f2.function(f1.i, f1.j);
		System.out.println(f2.i);
		System.out.println(f2.j);
	}

}
