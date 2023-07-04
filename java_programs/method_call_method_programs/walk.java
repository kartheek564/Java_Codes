class walk 
{
	public static void run()
	{
		System.out.println("run starts...");
		walk();
		System.out.println("run Ends...");
	}
	public static void walk()
	{
		System.out.println("walk starts...");
		System.out.println("walk Ends...");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");
		run();
		System.out.println("Main Ends...");
	}
}
