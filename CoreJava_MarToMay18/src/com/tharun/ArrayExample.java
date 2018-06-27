package com.tharun;
import java.util.Arrays;

public class ArrayExample {

		int[] i=new int[4];
		float[] f=new float[4];
		public float [] function(int[] i)
		{
			for (int k=0; k<=3; k++)
			{
				f[k] = i[k];
			}
			return f;
		}
		public void function ()
		{
			for (int k=0; k<=3; k++)
			{
				
			}
		}
			
			public static void main(String[] args) {
			ArrayExample ae = new ArrayExample();
			ae.i[0]=3;
			ae.i[1]=4;
			ae.i[2]=5;
			ae.i[3]=7;
			float[] f=ae.function(ae.i);
			ae.function();
			System.out.println(f);

	}

}
