    package com.vtalent.sowmya.Encap;

    public class TestInheritence {
	public static void main(String args[])
	{
	Inheritence f=new Inheritence();
	f.function(3);
	System.out.println(f.i);
	System.out.println(f.j);
	Second s=new Second();
	s.function(1);
	s.function(f.i,f.j);
	System.out.println(f.i);
	System.out.println(f.j);
    Three t=new Three();
    t.function(f.i);
    t.function(1,2,3);
    t.function(f.i,f.j);

	}
	}



