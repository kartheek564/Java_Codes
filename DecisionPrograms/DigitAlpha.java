class DigitAlpha 
{
	public static void main(String[] args) 
	{
		char c='L';
		if(c>='0'&&c<='9')
		{
		System.out.println(c+" is a digit");
		}
		else if (c>='A'&&c<='Z' || c>='a'&&c<='z')
		{
			System.out.println(c+" is a Alphabet");
		}
		else
		{
			System.out.println(c+" is not a digit and alphabet");
		}
	}
}
