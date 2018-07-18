package com.vtalent.sreenivas;

public class SampleOne
{
	float f1,f2;
	public void function(float f1)
	{
		this.f1=f1+f2;//25+1.5=26.5
	}
	public void function(float f1,float f2)//25,1.5    26.5,26.5
	{
		this.f1=this.f1+f1;//26.5+26.5=53.0
		this.f2=this.f2+f2;//
	}

}
