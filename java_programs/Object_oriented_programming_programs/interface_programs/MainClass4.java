interface A
{
	public void test1();
}
interface B extends A
{
	public void tes2();
}
interface C extends A
{
	public void test3();
}
class Demo implements A
{
	public void test1()
	{
		System.out.println("Test1 completed");
	}
	public void test2()
	{
		System.out.println("Test2 completed");
	}
}
class Demo1 implements A
{
	public void test1()
	{
		System.out.println("Test1 completed");
	}
	public void test3()
	{
		System.out.println("Test3 completed");
	}
}
class MainClass4
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Demo rv=new Demo();
		rv.test1();
		rv.test2();
		Demo1 rv1 = new Demo1();
		rv1.test1();
		rv1.test3();
		System.out.println("main ends");
	}
}
