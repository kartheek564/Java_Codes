class Sample 
{
	public static int i=10;
	public int j=20;
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		System.out.println(i);
		Sample s = new Sample();
		System.out.println(s.j);
		System.out.println("M2ain Ends");
	}
}
