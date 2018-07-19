    package com.vtalent.sowmya.Encap;

    public class TestInheritence {
	public static void main(String args[])
	{
	Inheritence f=new Inheritence();
	f.function(5);
	System.out.println(f.i);
	System.out.println(f.j);
	Second s=new Second();
	s.function(1);
	s.function(6,7);
	System.out.println(f.i);
	System.out.println(f.j);
    Three t=new Three();
    t.function(f.i);
    t.function(7,12,5);
    t.function(f.i,f.j);

	}
	}



