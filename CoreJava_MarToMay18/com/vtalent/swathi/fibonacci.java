package com.vtalent.swathi;



	class Fibonacci {
		public static void main(String args[])
		{
		int fvalue=Integer.parseInt(args[1]);
		int svalue=Integer.parseInt(args[2]);
		int limit=Integer.parseInt(args[10]);
		System.out.println(fvalue);
		while(fvalue<=limit)
		{
			System.out.println(svalue);
			int tvalue=fvalue+svalue;
			fvalue=svalue;
			svalue=tvalue;
			
		}
		
		
		}		

	}



