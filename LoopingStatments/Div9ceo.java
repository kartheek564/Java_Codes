class Div9ceo 
{
	public static void main(String[] args) 
	{
		int a=0;
		int count=0;
		while (a<=99)
		{
			if(a%9==0&&(a%2==1))
			{
				count++;
			}
			a++;
		}
		if (count%2==0)
		{
			System.out.println("Count is even...!");
		}
		else
		System.out.println("Count is odd..!");

	}
}
