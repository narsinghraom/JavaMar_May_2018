package com.vtalent.sahithi;

public class Mul {
	int i,j;
	public void function(int i)
	{
		this.i=this.i+i;
		j=i*i;
	}

}
class Mull extends Mul
{
	int i;
	public void function(int i,int j)
	{
		this.i=i+j;
		this.j=i+j+this.j;
	}
	
}
class Third extends Mul
{
	int i,j,k;
	public void function(int i,int j,int k)
	{
		function(i);
		this.i=this.i+this.j;
		this.j=i+i;
		this.k=this.i+this.j+this.k;
	}
}
