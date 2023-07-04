class NonStatic 
{
	public static int c = 100;
	public void read()
	{
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts ");
		new NonStatic().read();
		System.out.println("Main Ends ");
	}
}