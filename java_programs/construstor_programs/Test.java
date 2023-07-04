class Test 
{
	public int i ;
	public Test(int i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Test t1 = new Test(100);
		Test t2 = new Test(10);
		Test t3 = new Test(1);
		System.out.println("Main Ends");
	}
}
