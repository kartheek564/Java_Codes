class StaticDemo 
{
	public static boolean b;
	public static char c;
	public  String s;
	public  double d;
	public static void main(String[] args) 
	{
		StaticDemo sd= new StaticDemo();
		System.out.println("Main Starts ...");
		System.out.println(b);
		System.out.println(c);
		System.out.println(sd.s);
		System.out.println(sd.d);
		System.out.println("Main Ends ...");
	}
}
