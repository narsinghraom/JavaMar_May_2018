package com.vtalent.sreenivas;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SampleThree st=new SampleThree();//1
		st.function(25, 1.5f);
		st.function((int)st.l);
		//st.function(5);
		st.function(st.f1);
		st.function(st.f1,st.f1);
		System.out.println(st.l);
		System.out.println(st.f1);
		System.out.println(st.f2);
		System.out.println(st.i);*/
		
		SampleOne st1=new SampleTwo();
		st1.function(25,1.5f);
		st1.function(10);
		st1.function(st1.f1);
		st1.function(st1.f1,st1.f1);//26.5,26.5
		//System.out.println(st1.i);
		System.out.println(st1.f1);
		System.out.println(st1.f2);
		
		/*SampleOne st2=new SampleThree();
		st2.function(25,1.5f);
		st2.function(10);
		st2.function(st2.f1);
		st2.function(st2.f1,st2.f1);
		//st2.function(10);
		//System.out.println(st2.l);
		System.out.println(st2.f1);
		System.out.println(st2.f2);
		//System.out.println(st2.i);
*/		
		/*SampleTwo st3=new SampleThree();
		st3.function(25,1.5f);
		//st3.function((int)st3.l);
		st3.function(st3.f1);
		st3.function(st3.f1,st3.f1);
		//System.out.println(st3.l);
		System.out.println(st3.f1);
		System.out.println(st3.f2);
		System.out.println(st3.i);
		*/
	}
}
