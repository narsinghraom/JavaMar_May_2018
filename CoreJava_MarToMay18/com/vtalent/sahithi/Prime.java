package com.vtalent.sahithi;

public class Prime {
	public static void main(String args[])
	{
		int i,j,prime;
		for(i=1;i<10;i++)
		{
			prime=1;
		for(j=2;j<i/2;j++)
		{
			if(j/i==0)
			{
				prime=0;break;
			
			}
			
		}
		if(prime==1)
			System.out.print(i+" ");
	}
	}
}



