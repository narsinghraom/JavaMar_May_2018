package src.com.vtalent.karunya.overloading;

public class Test {
	public void m1(int i)
	{
		System.out.println("int-args");
		}
	public void m1(float f1)
	{
		System.out.println("float-args");
	}
	public static void main(String[] args)
	{
		Test t=new Test();
		 t.m1(10);
		 t.m1(10.5f);
		 t.m1('a');
		 t.m1(10l);
		// t.m1(10.5);
	}
}