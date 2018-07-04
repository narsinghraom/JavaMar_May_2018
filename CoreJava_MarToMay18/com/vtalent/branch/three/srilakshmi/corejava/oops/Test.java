package com.vtalent.branch.three.srilakshmi.corejava.oops;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverloadEx oe=new OverloadEx();
oe.x=5;
oe.f=1.5f;
oe.function(oe.x);
int k=oe.function(oe.x,oe.y);
float f=oe.function((float)k);
System.out.println(k);
System.out.println(f);
System.out.println(oe.f);
System.out.println(oe.x);
System.out.println(oe.y);

	}

}
