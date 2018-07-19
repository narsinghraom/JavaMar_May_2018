package com.vtalent.sahithi;

public class Prime {
	public static void main(Strng args[])
	{
		int i,j,prime;
		for(i=2;i<=100;i++)
		{
			prime=1;
		for(j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				prime=0;break;
			
			}
			
		}
		if(prime==1)
			System.out.print(i+" ");
	}
	}
}



