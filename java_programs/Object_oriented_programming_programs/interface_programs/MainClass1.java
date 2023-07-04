interface Sample
{
	public void test1();
}
class Demo implements Sample
{
	public void test1()
	{
		System.out.println("Test1 completed");
	}
}
class MainClass1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		new Demo().test1();
		System.out.println("Main Starts");
	}
}
