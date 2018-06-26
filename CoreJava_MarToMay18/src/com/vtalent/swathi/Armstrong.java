package com.vtalent.swathi;



	 class Armstrong {
		
		
		public static void main(String args[])
		{
		int num=Integer.parseInt(args[0]);
		int sum=0;
		int val=num;
		int result;
		while(num>0)
		{
		result=num%10;
		sum=sum+(result*result*result);
		num=num/10;
		}
		if(sum==val)
		{
		System.out.println("given string is armstrong");
		}
		else
		{
		System.out.println("given string is  not armstrong");
		}
		}
		

	}



