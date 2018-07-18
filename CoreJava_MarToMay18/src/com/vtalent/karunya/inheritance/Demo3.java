package src.com.vtalent.karunya.inheritance;

public class Demo3 {
	public static void main(String[] args){
		SampleTwo s21=new SampleThree();
		s21.function(35,1.5f);
		s21.function(12);
		s21.function(s21.f1);
		s21.function(s21.f1,s21.f1);
		//System.out.println(s21.l);
		System.out.println(s21.f1);
		//System.out.println(s21.i);
		System.out.println(s21.f2);
	  }
}




