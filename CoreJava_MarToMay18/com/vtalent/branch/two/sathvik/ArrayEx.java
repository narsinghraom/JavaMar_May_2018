package com.vtalent.branch.two.sathvik;

public class ArrayEx {
	int [] i;
	float [] f;
	public int []function (float [] f)
	{
		int [] i= new int [f.length] ;
		for(int k=0;k<=f.length-1;k++)
		{
			i[k]=(int)f[k];
			
		}
		return i;
	}
	public void function ()
	{
		i= function (f);
		for (int m=0;m<=i.length-1;m++)
		{
			System.out.println("float value="+ f[m] +" "+"int value="+i[m]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayEx ar=new ArrayEx();
ar.f=new float [3];
ar.f[0]=1.5f;
ar.f[1]=2.9f;
ar.function();


	}

}
