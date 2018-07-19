package com.vtalent.saikrishna;

public class Sample2 extends Sample1
{
int i;
float f1;//1.2
public void function(int i)
{
	this.i=i+i;	
}
public void function(float f1)//1.3
{
	this.f1=f1+super.f1;//1.2
	//System.out.println("value="+this.f1);
}
}
