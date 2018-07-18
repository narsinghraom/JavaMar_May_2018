package com.vtalent.ranjith.interface2;

public interface Abc {
//	int i;//error b'coz of evry interface  default having "public static final" 
	float pi=3.14f;// public static final float pi=3.14;
	public static final int k=0;
	public void function(int i);// public abstract void function(int i)
	public abstract void function(float f);
}
