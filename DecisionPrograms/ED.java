class ED 
{
	public static void main(String[] args) 
	{
		int n=14;
		if(n%2==0)
		{
		System.out.println(n+ " is a even number");
		if(n%5==0)
			{
			System.out.println(n+ " is divisible by 5");
			}
			else
			{
			System.out.println(n+ " is not divisible by 5");
	        }
		    }
		else
		{
			System.out.println(n+ " is a odd number");
			if(n%7==0)
			{
				System.out.println(n+ " is divisible by 7");
			}
			else
			{
				System.out.println(n+ " is  no 1divisible by 7");
			}
		}

	}
}
