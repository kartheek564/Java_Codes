class  Alphabet1
{
	public static void main(String[] args) 
	{
		char c='A';
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		{
			System.out.println(++c);
		}
		else
		{
			System.out.println(--c);
		}
	}
}
