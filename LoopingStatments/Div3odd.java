class Div3odd
{
	public static void main(String[] args) 
	{
		int count=0,a=15;
		while (a<=30)
		{
			if (a%2==1)
			{
				if (a%3==0)
				{
					count++;
				}
			}
			a++;
		}
		System.out.println(count);
	}
}
