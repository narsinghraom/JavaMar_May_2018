package com.vtalent.sahithi;

public class Sample1 {
	public static void main(Strng args[])
	{
		SampleThree st=new SampleThree();
		st.function(25,1.5f);
		st.function((int)st.l);
		st.function(st.f1);
		st.function(1.0f,1.0f);
		System.out.println(st.l);
		System.out.println(st.i);
		System.out.println(st.f1);
		System.out.println(st.f2);
	}

}
