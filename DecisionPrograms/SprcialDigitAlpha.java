class SprcialDigitAlpha
{
	public static void main(String[] args) 
	{
		char c='7';
		if(c>='A'&&c<='Z' || c>='a'&&c<='z')
		{
		System.out.println(c+" a Alphabet");
		}
		else if (c>='0'&&c<='9')
		{
			System.out.println(c+" is a Digit");
		}
		else
		{
			System.out.println(c+" is Special Character");
		}
	}
}
