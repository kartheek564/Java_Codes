class UpperAsciiAlphabets 
{
	public static void main(String[] args) 
	{
		for (char c='A';c<='Z' ;c++ )
		{
			if (c%2==0)
			{
				System.out.println(c+"-->"+(int)c);
			}
			
		}
	}
}
