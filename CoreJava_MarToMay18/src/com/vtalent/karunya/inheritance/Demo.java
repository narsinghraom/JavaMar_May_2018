package src.com.vtalent.karunya.inheritance;

public class Demo {
	 public static void main(String[] args){
			SampleOne s1=new SampleTwo();
			s1.function(25,1.5f);
			s1.function(10);
			s1.function(s1.f1);
			s1.function(s1.f1,s1.f1);
			//System.out.println(s1.l);
			System.out.println(s1.f1);
		    //System.out.println(s1.i);
			System.out.println(s1.f2);
	 }
}


