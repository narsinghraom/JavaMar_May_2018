package com.vtalent.branch.three.srilakshmi;
 class Array 
 {
	int []i=new int[4];
	public int[] function(int[]i,int j)
	{
	for(int k=0;k<=i.length-1;k++)
	{
		this.i[k]=i[k]+j;
	}
	return this.i;
	}
	public void function(int[]i)
	{
		System.out.println(i);
		for(int j=0;j<=i.length-1;j++)
		{
			System.out.println(i[j]);
		}
	}
	
	public static void main(String[] args) {
		Array a=new Array();
		a.i[0]=2;
		a.i[1]=3;
		a.i[2]=5;
		a.i[3]=7;
		a.function(a.function(a.i,a.i[2]));
		
	}
 }


