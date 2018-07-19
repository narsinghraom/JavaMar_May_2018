package src.com.vtalent.karunya.overloading;

public class Test1 {
	public static void main(String[] args){
	Example e1=new ExampleOne();
	e1.function(2);
	e1.function(2,3);
	System.out.println(e1.i);
	System.out.println(e1.j);
	//System.out.println(e1.k);
}
}
