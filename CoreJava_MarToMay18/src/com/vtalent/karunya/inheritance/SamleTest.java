package src.com.vtalent.karunya.inheritance;

public class SamleTest {
	public static void main (String[] args){
		SampleThree st=new SampleThree();
		st.function(25,1.5f);
		st.function((int)st.l);
		st.function(st.f1);
		st.function(st.f1,st.f1);
		System.out.println(st.i);
		System.out.println(st.l);
		System.out.println(st.f2);
	}
}
