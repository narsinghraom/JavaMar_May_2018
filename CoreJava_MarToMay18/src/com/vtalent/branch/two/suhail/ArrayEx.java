package com.vtalent.branch.two.suhail;

public class ArrayEx {

	int[] i;
	float[] f;
	public int[] function(float[] f){
		int[] i = new int[f.length];
		for(int k = 0; k<f.length; k++)
		{
			i[k]=(int) f[k];
			
		}
		return i;
	}
	public void function()
	{
		i = function(f);
		for(int m=0; m<i.length; m++)
		{
			System.out.println("float value:" + f[m]+ " " + "int value:" + i[m]);
		}
	}
	public static void main(String[] args) {
		ArrayEx ae = new ArrayEx();
		ae.f = new float[4];
		ae.f[0] = 1.5f;
		ae.f[1] = 2.5f;
		ae.f[2] = 14.5f;
		ae.f[3] = 5.9f;
		ae.function();
	}

}//
