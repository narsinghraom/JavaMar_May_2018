package com.vtalent.branch.three.srilakshmi;

public class ArrayEx1 {
	int[]i;
	float[]f;
	public int[] funtion(float[] f)
	{
		int[]i=new int[f.length];
		for(int k=0;k<=f.length-1;k++)
		{
		i[k]=(int)f[k];	
		}
		return i;
	}
	public void function()
    {
		i=funtion(f);
		for(int m=0;m<=i.length-1;m++)
		{
			System.out.println("float value="+f[m]+""+"int value="+i[m]);
		}
    }
		public static void main(String[] args) {
			ArrayEx1 a1=new ArrayEx1();
			a1.f=new float[4];
			a1.f[0]=1.5f;
			a1.f[1]=2.5f;
			a1.f[2]=14.9f;
			a1.f[3]=5.9f;
			a1.function();
			
		}
		

		
		
	
}
