package com.vtalent.swathi;

class Variables {
	int x=5;
	static int y=10;
	public static void main(String args[])
	{
		Variables v1=new Variables();
		Variables v2=new Variables();
		v1.x=v1.x+3;
		v1.y=v1.y+3;
		System.out.println(v1.x);
		System.out.println(v1.y);
		System.out.println(v2.x);
		System.out.println(v2.y);
	}

}
