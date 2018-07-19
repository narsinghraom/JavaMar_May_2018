package src.com.vtalent.karunya.overloading;

public class Test2 {
	public static void main(String[] args){
		SampleOne s1=new SampleTwo();
		s1.function(25,1.5f);
		s1.function(10);
		s1.function(s1.f1);
		s1.function(s1.f1,s1.f1);
		//System.out.println(s1.l);
		System.out.println(s1.f1);
		System.out.println(s1.f2);
		//System.out.println(s1.i);
		/*SampleOne s11=new SampleThree();
		s11.function(15,1.5f);
		s11.function(20);
		s1.function(s11.f1);
		s11.function(s11.f1,s11.f1);
		//System.out.println(s1.l);
		System.out.println(s11.f1);
		System.out.println(s11.f2);
		//System.out.println(s11.i);
*/	}
}
