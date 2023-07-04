interface A
{
	public void test1();
}
interface B extends A
{
	public void test2();
}
interface C extends A
{
	public void test3();
}
class Demo implements B,C
{
	public void test1()
	{
		System.out.println("Test1 completed");
	}
	public void test2()
	{
		System.out.println("Test2 completed");
	}
	public void test3()
	{
		System.out.println("Test3 completed");
	}
}
class MainClass5
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Demo d=new Demo();
		d.test1();
		d.test2();
		d.test3();
		System.out.println("Main Ends");
	}
}
