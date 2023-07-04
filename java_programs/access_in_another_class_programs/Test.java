class StaticM
{
	public static String s = "This is static variable";
	public static void demo()
	{
		System.out.println("This is Static method ");
	}
}


class NonStaticM
{
	public  String s = "This is non static variable";
	public  void demo1()
	{
		System.out.println("This is non Static method ");
	}
}
class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		System.out.println(StaticM.s);
		StaticM.demo();
		System.out.println(" ");
		NonStaticM nsm = new NonStaticM();
		System.out.println(nsm.s);
		nsm.demo1();
		System.out.println("Main Ends");
	}
}
