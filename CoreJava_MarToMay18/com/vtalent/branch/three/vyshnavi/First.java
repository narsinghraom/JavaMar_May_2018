package com.vtalent.branch.three.vyshnavi;

public class First {
	int i,j;
	static float f1;
	public int function(int i,int j)
	{
		this.i=i*j;
		this.j=this.i+j;
		f1=this.i+this.j;
		return (int)f1;
	}

}
class Second extends First
{
	int i;
	public int function(int i)
	{
		this.i=this.i+i;
		super.i=super.i+i;
		return super.i;
	}
}

class Test
{
	public static void main(String args[])
	{
		First f1=new First();
		int k=f1.function(2, 3);
		System.out.println(k);
		System.out.println(First.f1);
		Second s1=new Second();
		int m=s1.function(k);
		System.out.println(m);
		System.out.println(s1.i);
		System.out.println(s1.j);
	}
}