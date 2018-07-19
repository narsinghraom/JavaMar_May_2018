package com.vtalent.saikrishna;

public class Sample1 
{
    float f1,f2;//1.2,1.4
	public void function(float f1)
	{
		this.f1=f1+f2;
	}
	public void function(float f1,float f2)// 1.3,1.3
	{
		this.f1=this.f1+f1;//1.3
		this.f2=this.f2+f2;//1.3
		//System.out.println("value="+this.f1+" next value="+this.f2);
	}
}
