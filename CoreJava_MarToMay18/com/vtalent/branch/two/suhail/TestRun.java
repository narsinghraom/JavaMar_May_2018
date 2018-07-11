package com.vtalent.branch.two.suhail;

class DemoOne
{
	int i, j;
	float f1,f2;
	public void function(int i)
	{
		this.i = i * i;
		j = this.i + i;
		
	}
	public int functoin(int i, int j)
	{
		this.i = this.i + (i * j);
		this.j = this.j + this.i;
		return i+j;
	}
	public float function(float k)
	{
		this.f1 = f1 + f1;
		return f1;
	}
}


class DemoTwo extends DemoOne{
	int i, j;
	public int function(int i, int j)
	{
		this.i = super.i + this.i + this.j;
		this.j = super.j + this.j + j;
		return this.i + this.j;
	}
	public float function(float f1, float f2){
		this.f1 = this.f1 + f1;
		this.f2 = this.f2 +f2;
		return f1+f2;
	}
	public float function(float f1)
	{
		this.f1 = f1 * f1;
		return this.f1;
	
	}

}

//public class TestRun
//{
//	public static void main(String[] args) {
//		DemoOne d1 = new DemoOne();
//		d1.function(2);
//		intm k = d1.functoin(2, 3);
//		float f1 = d1.function((float)k);
//		System.out.println(k + "  " + f1);
//		DemoTwo d2 = new DemoTwo();
//		d2.function(3);
//		k = d2.function(k, k+1);
//		f1 = d2.function(f1, f1+1.3f);
//		System.out.println(k + "  " + f1);
//	}
//}


public class TestRun
{
	public static void main(String[] args) {
		DemoOne d1 = new DemoTwo();
		d1.function(2);
		int k = d1.functoin(2, 3);
		//float f1 = d1.function(1.0f, 1.0f);
		float f2 = d1.function(1.0f);
		System.out.println(k + " " + f2);
	}
}