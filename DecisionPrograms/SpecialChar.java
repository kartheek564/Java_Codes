class SpecialChar 
{
	public static void main(String[] args) 
	{
		char c='8';
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'))
		{
			System.out.println(c+" is not a special Character");
			if(c%2==0)
			{
				System.out.println(c+" is a Even number");
			}
			else
			{
				System.out.println(c+" is an Odd number");
			}
		}
		else
		{
			System.out.println(c+" is a special Character--The last digit of Ascii value is "+c%10);
		}
	}
}
