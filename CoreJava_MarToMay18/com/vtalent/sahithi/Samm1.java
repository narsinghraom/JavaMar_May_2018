package com.vtalent.sahithi;

public class Samm1 {
	float f1,f2;
	public void function(float f1)
	{
		this.f1=this.f1+f2;
	}
	public void function(float f1,float f2)
	{
		this.f1=this.f1+f1;
		this.f2=this.f2+f2;
	}
}
class Samm2 extends Samm1
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
class Samm3 extends Samm2
{
	long l;
	float f1;
	public void function(long l,float f1)
	{
		this.l=l;
		this.f1=f1;
	}
}