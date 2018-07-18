package com.vtalent.sreenivas;

public class Charan1 extends Charan
{
	int i; 
	public void function(int i,int j)
	{
		//super.function(i, j);
		this.i=super.i+i;
		this.j=j+super.j;
		//k=this.i+this.j;
	}

}
