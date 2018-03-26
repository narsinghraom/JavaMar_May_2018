package com.vtalent.branch.two.suhail;
interface ABC
{
	public static final float pi= 3.1412f;
	public void function(int i);
	public abstract void function(float f1);
	
}

abstract class Example3 implements ABC
{
	public void function(){
		
	}
}

class Example4 extends Example3
{

	public void function(int i) {
		i = (int) pi + i;
		System.out.println(i);
	}

	public void function(float f1) {
		f1 = pi +f1;
		System.out.println(f1);
//		pi=f1;
	}

}

public class Test6 {

	public static void main(String[] args) {
		ABC abc = new Example4();
		abc.function(5);
		abc.function(1.5f);
		
	}

}
