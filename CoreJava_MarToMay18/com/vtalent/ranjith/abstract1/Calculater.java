package com.vtalent.ranjith.abstract1;



public abstract class Calculater {
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public void sub(int i,int j) {
		System.out.println(i-j);
	}
	abstract void div(int i,int j);
	public abstract void mul(int i,int j);
	

}
