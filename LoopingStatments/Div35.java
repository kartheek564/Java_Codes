class Div35 
{
	public static void main(String[] args) 
	{
		int a=786,count=0,count1=0;
		while (a<=937)
		{
			if (a%3==0&&a%5==0)
			{
				count++;
			}
			a++;
		}
		System.out.println(count+" numbers are divisible by 3 and 5 between 768 to 937");
		//System.out.println(count1+" numbers are divisible by 5 between 768 to 937");
	}
}
