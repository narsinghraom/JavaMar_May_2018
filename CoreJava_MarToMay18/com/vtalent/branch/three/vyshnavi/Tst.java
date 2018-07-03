package com.vtalent.branch.three.vyshnavi;
 class Fst
{
	int a,b;
	Fst()
	{
		a=5;
		b=a+10;
	}
	public int functionOne(int a)
	{
		this.a=(a*a)+this.a;
		b=this.a+b;
		return a+b;
	}
}
class Snd extends Fst
{
	int c;
	Snd()
	{
		c=5;
	}
	public int function(int c)
	{
		this.c=c+a;
		return this.c+b;
		
	}
}

	

public class Tst {
	public static void main(String args[])
	{
		Fst f=new Fst();
		int a=f.functionOne(5);
		System.out.println(a);
		System.out.println(f.a);
		System.out.println(f.b);
		Snd s=new Snd();
		int b=s.functionOne(2);
		int c=s.function(b);
		System.out.println(b+"   "+c);
		System.out.println(s.b);
		System.out.println(s.c);
	}


}
