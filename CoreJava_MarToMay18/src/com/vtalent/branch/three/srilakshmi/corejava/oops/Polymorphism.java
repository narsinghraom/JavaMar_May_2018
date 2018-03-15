package com.vtalent.branch.three.srilakshmi.corejava.oops;
class Polymorphism
{
	int x,y;
	public void function(int x)
	{
	this.x=x+x;	
	}
	public int function(int x,int y)
	{
		this.x=this.x+x;
		this.y=x+y;
		return x+y;
	}
	
}
 class OverloadEx extends Polymorphism
 {
int x;
float f;
public void function(int x)
{
	this.x=x*x;
	super.x=x;
	}
public float function(float f)
{
	this.f=f+f;
	return f;
}
 }








