package com.vtalent.sowmya.Encap;

public class Overloading {
	float f1,f2;
	public void function(float f1)
	{
		this.f1=f1+f2;
	}
	public void function(float f1,float f2)
	{
		this.f1=this.f1+f2;
		this.f2=this.f2+f2;
	}
}
	class Four extends Overloading
	{
		int i;
		float f1;
		public void function(int i)
		{
			this.i=i+i;
		}
		public void function(float f1)
		{
			this.f1=f1+super.f1;
		}
		}
	class Five extends Four
	{
		long l;
		float f1;
		public void function(int i,float f1)
		{
			this.i=i;
		}
	
	public static void main(String args[])
	{
		Four fa=new Five();
		fa.function(25,1.5f);
		fa.function((int)fa.i);
		fa.function(fa.f1);
		fa.function(fa.i);;
		System.out.println(fa.i);
		System.out.println(fa.i);
		System.out.println(fa.f1);
		System.out.println(fa.f2);
		
	}
	}

