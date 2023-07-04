class  EvenOdd
{
	public static void main(String[] args) 
	{
		int i=120,count=0,count1=0;
		while (i<=420)
		{
			if (i%2==0)
			{
				count++;
			}
			if (i%2==1)
			{
				count1++;
			}
			i++;
		}
		System.out.println(count+" is the count of even numbers between 120 to 420");
		System.out.println(count1+" is the count of odd numbers between 120 to 420");
	}
}
