package com.vtalent.branch.two.suhail;

class FirstOne
{
	int i, j;
	public void function(int i)
	{
		this.i = i + i;
		j = this.i;
		
	}
}
class secondOne extends FirstOne
{
	int j;
	public void function(int i , int j)
	{
		this.i = i + j + this.i;
		this.j = super.j + j;
		
	}
	public void function(int j)
	{
		this.i = this.j + i;
		this.j = this.j + j;
		
	}
}

class ThirdOne extends secondOne
{
	
		public void function(int i, int j)
		{
			this.i = this.i + i;
			this.j = this.j + j;
		}
		public void function()
		{
			this.i = this.i + this.j;
			this.j = this.j + this.i;
			
		}
	
}

public class Test4 {

	public static void main(String[] args) {
		FirstOne f = new ThirdOne();
		f.function(2);
//		f.function(2,5);
//		f.function();
		
		FirstOne f1 = new secondOne();
		f1.function(2);
//		f1.function(2,3);
//		f1.function();
		
		secondOne s1 = new ThirdOne();
//		s1.function();
		s1.function(2);
		s1.function(2,3);
		
//		ThirdOne t = new FirstOne();
//		ThirdOne t1 = new secondOne();
//		secondOne s2 = new FirstOne();
//		
	}

}
