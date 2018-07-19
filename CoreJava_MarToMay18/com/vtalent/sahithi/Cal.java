package com.vtalent.sahithi;

abstract class Cal {
	public void add(int i,int j){
		System.out.println(i+j);
	}
	public void sub(int i,int j){
		System.out.println(i-j);
	}
	public abstract void div(int i,int j);
	public abstract void mul(int i,int j);
}
class Calc extends Cal{
	public void div(int i,int j){
		System.out.println(i/j);
	}
	public void mul(int i,int j){
		System.out.println(i*j);
	}
}
