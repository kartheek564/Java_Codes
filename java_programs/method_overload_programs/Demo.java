class Demo 
{
	public static void test(int a,int b) 
	{
		System.out.println("Inside test method with int,int args");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
	public static void test(double d,double e) 
	{
		System.out.println("Inside test method with double,double args");
		System.out.println("d : "+d);
		System.out.println("e : "+e);
	}
	public static void test(int a,int b,int c) 
	{
		System.out.println("Inside test method with int,int,int args");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
	}
	public static void test(boolean z) 
	{
		System.out.println("Inside test method with boolean arg");
		System.out.println("z : "+z);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
			test(10,20);
			test(5.5,6.5);
			test(10,20,50);
			test(true);
		System.out.println("main ends");
	}
}
