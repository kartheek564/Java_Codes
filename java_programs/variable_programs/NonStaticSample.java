class NonStaticSample 
{
	public String s1="Haii";
	public String s2="Hello";
	public static void main(String[] args) 
	{
		NonStaticSample s = new NonStaticSample();
		System.out.println("Main Starts ...");
		System.out.println(s.s1);
		System.out.println(s.s2);
		System.out.println("Main Ends ...");
	}
}
