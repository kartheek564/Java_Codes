class LocalNonStaticDemo 
{
	public  int a=10;
	public  void display()
	{
		int a=10;
		System.out.println("Display Starts ...");
		System.out.println(a);
		System.out.println("Display Ends ...");
	}
	public  void result()
	{
		char c='Z';
		System.out.println("result Starts ...");
		System.out.println(c);
		System.out.println("result Ends ...");
	}
	public static void main(String[] args) 
	{
		LocalNonStaticDemo l= new LocalNonStaticDemo();
		System.out.println("Main Starts ...");
		System.out.println(l.a);
		l.display();
		l.result();
		System.out.println("Main Ends ...");
	}
}
