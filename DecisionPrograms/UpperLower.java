class UpperLower 
{
	public static void main(String[] args) 
	{
		char c='@';
		if(c>='a'&&c<='z')
		{
		System.out.println(c+" is a lower case letter");
		}
		else if (c>='A'&&c<='Z')
		{
			System.out.println(c+" is a upper case");
		}
		else
		{
			System.out.println(c+" is not a digit");
		}
	}
}
