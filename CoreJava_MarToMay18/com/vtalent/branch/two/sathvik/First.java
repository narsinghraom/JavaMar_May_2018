package com.vtalent.branch.two.sathvik;

public class First {
int i,j;
public void function(int i)
{
	this.i=i+j;
	j=this.j;
}
}
class Second extends First
{
	int j;
	public void function (int i, int j)
	{
		this.i=i+j+this.i;
		this.j=super.j+j;
	}
	public void function(int i)
	{
		this.i=this.i+j;
		this.j=super.j+j;
		
	}
}
class Third extends Second
{
	public void function (int i, int j)
	{
		this.i=this.i+i;
		this.j=this.j+j;
			}
	public void function ()
	{
		this.i= this.i+i;
		this.j=this.i+this.j;
}
}
	class Test
	{
		public static void main(String[] args) {
		
	First f=new Third();
		f.function(2);
		//f.function(2,3);
		//f.function();
		
    First f1= new Second();
		f1.function(2);
		//f.function(2,3);
		//f.function();
		
	Second s1 = new Third();
	//s1.function();
	s1.function(2,3);
	s1.function(2);
		
	}

}
