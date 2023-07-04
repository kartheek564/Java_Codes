class MethodWithArg 
{
	public  int test(int a)
	{
		System.out.println(a);
		return a;
	}
	public  boolean test1(boolean b)
	{
		System.out.println(b);
		return b;
	}
	public static char test2(char c)
	{
		System.out.println(c);
		return c;
	}
	public static double test3(double d)
	{
		System.out.println(d);
		return d;
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts..");
		MethodWithArg m= new MethodWithArg();
		m.test(10);
		m.test1(true);
		test2('c');
		test3(6.6);
		System.out.println("Main Ends..");
	}
}
