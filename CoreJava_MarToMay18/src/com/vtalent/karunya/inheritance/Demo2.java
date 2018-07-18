package src.com.vtalent.karunya.inheritance;

public class Demo2 {
	 public static void main(String[] args){
			SampleOne s11=new SampleThree();
			s11.function(15,1.5f);
			s11.function(25);
			s11.function(s11.f1);
			s11.function(s11.f1,s11.f1);
			//System.out.println(s11.l);
			System.out.println(s11.f1);
			//System.out.println(s11.i);
			System.out.println(s11.f2);
		  }
}


