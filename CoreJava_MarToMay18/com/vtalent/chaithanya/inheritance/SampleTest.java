package com.vtalent.chaithanya.inheritance;

public class SampleTest {
	public static void main(){
	SampleThree st5=new SampleThree();//1
	
	
	/*st.function(25, 1.5f);
	st.function((int)st.l);
	st.function(5);
	st.function(st.f1);
	st.function(st.f1,st.f2);*/
	st5.function(25, 1.5f);
	//st1.function((int)st.l);
	st5.function(5);
	st5.function(st5.f1);
	st5.function(st5.f1,st5.f1);
	System.out.println(st5.l);
	System.out.println(st5.i);
	/*st1.function(st.f1);
	st1.function(st.f1,st.f2);
	System.out.println(st.l);
	System.out.println(st.f1);
	System.out.println(st.f2);
	System.out.println(st.i);*/
	System.out.println("==================");
	System.out.println(st5.f1);
	System.out.println(st5.f2);
	
	
	}
	
}


