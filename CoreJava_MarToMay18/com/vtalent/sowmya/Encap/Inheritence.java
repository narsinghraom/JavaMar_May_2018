package com.vtalent.sowmya.Encap;

public class Inheritence {
	
int i,j;
public void function(int i)
{
	this.i=i+j;
	this.j=this.i*i;
}
}
 class Second extends Inheritence{
 
	 int i;
public void function(int i,int j)
{

	this.i=this.i+j;
	this.j=i*this.i*j;
}}
 class Three extends Second
 {
	 int i,j,k;
	 public void function(int i, int j, int k)
	 {
		 this.i=i+j;
		 this.j=this.j+i;
		 this.k=this.i+this.j;
		 
	 }
	 }
	 
 
 

