package com.vtalent.branch.one.amaresh;

public class Charan
{
	int a,b;
	static float c,d;
	public void naresh(int a,int b)
	{
		this.a=a;
		this.b=b;
		Charan c1=new Charan();
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println(a);
		System.out.println(b);
	}
	public static Charan sathya()
	{
		Charan c3=new Charan();
		Charan.c=c;
		Charan.d=d;
		System.out.println(c3.a);
		System.out.println(c3.b);
		System.out.println(c3);
		return c3;
	}
	public static float venky(float f1,float f2)
	{
		c=f1;
		d=f2;
		System.out.println(c);
		System.out.println(d);
		Charan c2=new Charan();
		System.out.println(c2.a);
		System.out.println(c2.b);
		return (c+d);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Charan c3=new Charan();
		c3.naresh(10,20);
		Charan.venky(1.5f,2.3f);
		Charan c=Charan.sathya();

	}

}
