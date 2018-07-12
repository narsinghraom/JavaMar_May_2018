package src.com.vtalent.chaitanya;

public class Test {

	public static void main(String[] args) {
		First f = new First();
		f.function(5);
		System.out.println(f.i);
		System.out.println(f.j);
		Second s = new Second();
		s.function(3);
		s.function(f.i, f.j);
		System.out.println(s.i);
		System.out.println(s.j);

	}
}
