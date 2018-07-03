package com.vtalent.branch.three.srilakshmi.corejava.oops;


public class Singleinheritance  {
		public static void main(String args[])
		{
			
		First f=new First();
		f.function();
		System.out.println(f.i);
		System.out.println(f.j);

	Sinheritance s = new Sinheritance();
	s.function();
	s.functionOne(f.i);
	s.functionOne(s.i);
	System.out.println(s.j);
		}
	

	}


