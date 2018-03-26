package com.vtalent.branch.two.sathvik;
class Super
{
	int a,b;
	static float f1,f2;
	public int function(int a, int b)
	{
		this.a=a+b;
		this.b=a*b;
		return this.a+a;
	}
	public float function(float f1, float f2)
	{
		Super.f1=f1+f2;
		Super.f2=f1-f2;
		return Super.f1+f2;
	}
}
class Sub extends Super
{
	int a,b;
	public int function(int a,int b)
	{
		a=a+super.function(2, 4);
		super.b=a+b;
		this.a=super.a;
		return super.b+b;
	}
}
 class SubMost extends Sub
{	
	public float function(float f1,float f2)
	{
		Super.f1=f1+Super.f2;
		Super.f2=f2+Super.f1;
		return Super.f1+f1;
	}
	public static void main(String[] args) 
	{
		Sub s=new Sub();
		Super f= (Super)s;
		int a=(int)f.function(1.5f, 1.5f);
		int b=f.function(a, 2);
		System.out.println(a);
		System.out.println(b);
	}

}
