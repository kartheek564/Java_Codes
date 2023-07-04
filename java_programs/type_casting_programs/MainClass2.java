class A
{
	public void test()
	{
		System.out.println("Test");
	}
}
class B extends A
{
	public void test()
	{
		System.out.println("Test completed");
	}
}
class MainClass2 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		A a1= (A) new B();
		a1.test();
		System.out.println("Main ends");
	}
}
