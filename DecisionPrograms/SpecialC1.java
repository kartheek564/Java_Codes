class SpecialC1 
{
	public static void main(String[] args) 
	{
		char c='6';
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'))
		{
			System.out.println(c+" is not a special character");
			if((c%2==0))
			{
					System.out.println(c+" is an even number");
			}
			else
			{
				System.out.println(c+" is an odd number");
		}
		}
		else
		{
			System.out.println(c+" is a Special Character - The last digit of the ascii value is "+  (c%10));		
			
	}
}
}
