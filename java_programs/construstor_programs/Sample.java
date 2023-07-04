class Sample 
{
	public Sample()
	{
		System.out.println("Constructor Executed");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Sample d1 = new Sample();
		Sample d2 = new Sample();
		Sample d3 = new Sample();
		System.out.println("Main Ends");
	}
}
