class CharAscii1
{
	public static void main(String[] args) 
	{
		int n = 'd';
		if(n%2==0)
		{
		  System.out.println(n+" is an even number the next number is " + (n+1));
		}
		else
		{
			System.out.println(n+" is not a evenn number the previous of number is " +(n-1));
			//System.out.print((char)(n-1));
		}
	}
}
