package com.vtalent.sowmya.Encap;

public class Polymerphism {
	int i,j;
	public void function(int i)
	{
		this.i=i+this.i;
		j=this.i+j;
	}
	public void function(int i,int j)
	{
		this.i=this.i+this.j+i;
		this.j=this.j+j;
	}

}
class  Example1 extends Polymerphism
{
	int i;
	public void function(int i, int j)
	{
		super.function(i,j);
		this.i=super.i+i;
		this.j=j+super.j;
		
	}
}
class Poly
{
	public static void main(String args[])
	{
		Polymerphism p=new Example1();
		p.function(2);
		p.function(2,3);
		System.out.println(p.i);
		System.out.println(p.j);
		
	}
}

