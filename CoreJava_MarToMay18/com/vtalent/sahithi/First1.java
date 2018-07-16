package com.vtalent.sahithi;

public class First1 {
	public static void main(String args[])
	{
		First f=new Second();
		f.function(2);
		System.out.println(f.i);
		System.out.println(f.j);
		Second s=new Second();
		f.function(3);
		s.function(f.i,f.j);
		System.out.println(s.i);
		System.out.println(s.j);
		
		
	}

}
