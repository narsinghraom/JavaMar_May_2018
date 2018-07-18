package src.com.vtalent.karunya.overloading1;

public class Example {
	int i,j;
	public void function(int i)
	{
		this.i=i+this.i;
		j=this.i+j;
	}
	public void function(int i,int j)
	{
		this.i=this.i+this.j+i;
		this.j=this.j+j;
	}
}
