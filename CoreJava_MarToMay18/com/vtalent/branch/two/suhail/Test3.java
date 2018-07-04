package com.vtalent.branch.two.suhail;

class Third extends Second
{
	int j;
	public void function11(int i, int j)
	{
		super.function(i, j);
		this.i = this.j + i;
		this.j = this.j + j;
//		return super.i;
		
	}
}
public class Test3 {

	public static void main(String[] args) {
		Third t = new Third();
		t.function(2,5);
		int k = t.function(t.j);
		System.out.println(k);
		System.out.println(t.i);
		System.out.println(t.j);

	}

}
