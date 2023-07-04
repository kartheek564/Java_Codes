package Sample;
public class A {
public static int a=10;
public void run()
{
	System.out.println("Running method");
}
	public static void main(String[] args) {
		System.out.println(a);
		A s = new A();
		s.run();
		System.out.println("This is main class");

	}

}
