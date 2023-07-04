package Sample1;
import Sample.A;
public class C extends A
{
	public static void main(String[] args) {
		System.out.println(A.a);
		A s = new A();
		s.run();
		System.out.println("This is in another package");

	}

}