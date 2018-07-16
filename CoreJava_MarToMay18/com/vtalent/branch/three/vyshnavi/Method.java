package com.vtalent.branch.three.vyshnavi;
class Demo1
{
	int i,j;
	float f1,f2;
	public int function(int i)
	{
		this.i=i*i;
		j=this.i+i;
		return i;
	}
	public int function(int i,int j)
	{
		this.i=this.i+(i*j);
		this.j=this.j+this.i;
		return i+j;
	}
	public float function(float f1)
	{
		this.f1=f1+f1;
		return f1;
	}
}
class Demo2 extends Demo1
{
	int i,j;
	public int function(int i,int j)
	{
		this.i=super.i+this.i+i;
		this.j=super.j+this.j+j;
		return this.i+this.j;
	}
	public float function(float f1,float f2)
	{
		this.f1=this.f1+super.f1+f1;
		this.f2=this.f2+f2;
		return f1+f2;
	}
	public float function(float f1)
	{
		this.f1= f1;
		return this.f1;
		
	}
}


public class Method {
	public static void main(String args[])
	{
		Demo1 d1=new Demo1();
		d1.function(2);
		int k=d1.function(2,3);
		float f1=d1.function((float)k);
		System.out.println(k);
		System.out.println(f1);
		Demo2 d2=new Demo2();
		d2.function(3);
		k=d2.function(k,k+1);
		f1=d2.function(f1,f1+0.3f);
		System.out.println(k);
		System.out.println(f1);
		
		
	}
}
