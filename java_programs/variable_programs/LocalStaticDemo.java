class LocalStaticDemo 
{
	public static int a=10;
	public static void display()
	{
		int a=10;
		System.out.println("Display Starts ...");
		System.out.println(a);
		System.out.println("Display Ends ...");
	}
	public static void result()
	{
		char c='Z';
		System.out.println("result Starts ...");
		System.out.println(c);
		System.out.println("result Ends ...");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts ...");
		System.out.println(a);
		display();
		result();
		System.out.println("Main Ends ...");
	}
}
