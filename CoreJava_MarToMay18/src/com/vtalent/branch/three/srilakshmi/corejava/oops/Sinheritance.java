package com.vtalent.branch.three.srilakshmi.corejava.oops;
class First
{
	int i,j;
public void function()
{
	i=10;
	j=i+5;
}
}
class Sinheritance extends First
{
	int i;
	public void functionOne(int i)
	{
		this.i=i+super.i;
	}
}


