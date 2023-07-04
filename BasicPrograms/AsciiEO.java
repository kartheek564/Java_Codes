class AsciiEO 
{
	public static void main(String[] args) 
	{
		int a='A';
		int b='b';
		int sum= a+b;
		System.out.println((sum)%2==0 ? sum+" is Even--the 1st character next 10th ascii value is "+(a+10) : sum+" is Odd---the second characetr ascii value is "+ (b+0));

	}
}
