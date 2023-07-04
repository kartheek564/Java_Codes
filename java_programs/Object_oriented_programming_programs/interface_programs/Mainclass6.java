interface A
{
	public void test1();
}
interface B
{
	public void test2();
}
class Demo implements A,B
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
class MainClass6
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Demo d1=new Demo();
		d1.test1();
		d1.test2();
		System.out.println("main ends");
	}
}
