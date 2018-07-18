package com.vtalent.saikrishna;

public class SecondInheritancePrg extends FirstInheritancePrg 
{
	int i;
	public void function(int i,int j)
	{
		this.i=i+j;
		this.j=i+j+this.j;
	}
	
}
