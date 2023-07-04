class A
{
	public static int a=10;
	public int b=20;
}
class B
{
	public static void run()
	{
		System.out.println(A.a);
		A a1 = new A();
		System.out.println(a1.b);
	}
	public void walk()
	{
		run();
	}
}
class MainClass2 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.walk();
	}
}
