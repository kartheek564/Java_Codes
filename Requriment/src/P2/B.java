package P2;
import P1.A;
public class B {
public static double p =10.6;
public double q = 3.14;
public static void run1()
{
	System.out.println("Package P2 Static method ----> Running in another class");
}
public  void walk1()
{
	System.out.println("Package P2 Non-Static method ----> Walking in another class");
}
	public static void main(String[] args)
	{
	A a1 = new A();
	B b1 = new B();
	System.out.println(p);
	System.out.println(b1.q);
	System.out.println(A.k);
	System.out.println(a1.b);
	a1.run();
	a1.walk();
	run1();
	b1.walk1();
	}
}
