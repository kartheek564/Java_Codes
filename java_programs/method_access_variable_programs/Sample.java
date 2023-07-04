class Sample 
{
	public int battery = 20;
	public static void write()
	{
		Sample sample = new Sample();
		System.out.println(sample.battery);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts ");
		write();
		System.out.println("Main Ends ");
	}
}
