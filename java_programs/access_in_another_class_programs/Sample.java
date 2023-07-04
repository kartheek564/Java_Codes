class Test
{
	public static int i=20;
	public int j=54;
}
class Sample 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts ");
		System.out.println(Test.i);
		Test test = new Test();
		System.out.println(test.j);
		System.out.println("Main Ends ");
	}
}