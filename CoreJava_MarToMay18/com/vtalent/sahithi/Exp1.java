package com.vtalent.sahithi;

public class Exp1 extends Exp {
	int i,k;
	public void function(int i,int j)
	{	
		super.function(i, j);
		this.i=super.i+i;
		this.j=j+super.j;
		k=this.i+this.j;
	}

}
