package src.com.vtalent.karunya.overloading;

public class Test3 {
	public void m()
	{
	System.out.println("no-args");
	}
	public void m(int i)
	{
		System.out.println("int-args");
	}
    public void m(double d)
    {
    	System.out.println("double-args");
    }
    public static void main(String[] args)
    {
    	Test t=new Test();
    	t.m();
    	t.m(10);
    	t.m(10.5);
    }
}
