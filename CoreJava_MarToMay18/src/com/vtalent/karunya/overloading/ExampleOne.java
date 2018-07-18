package src.com.vtalent.karunya.overloading;

public class ExampleOne extends Example {
	int i,k;
	public void function(int i,int j)
	{
		super.function(i, j);
		this.i=super.i+i;
		this.j=j+super.j;
		k=this.i+this.j;
	}
}
