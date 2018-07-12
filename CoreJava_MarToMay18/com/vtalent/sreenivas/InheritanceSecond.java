package com.vtalent.sreenivas;

public class InheritanceSecond extends InheritanceFirst
{
	int i;
	public void function(int i,int j)
	{
		function(i);
		this.i=i+j;
		this.j=i+j+this.j;
	}

}
