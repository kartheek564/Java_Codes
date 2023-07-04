class PrimeNum1To100 
{
	public static void main(String[] args) 
	{
		int n=100;
		int i,j;
		int count=0;
		for (i=1;i<n ;i++ )
		{
			for (j=2 ;j<=i ;j++ )
			{
				if (i%j==0)
				{
					break;
				}
			}
		if(i==j)
			{
				count++;
				System.out.println(j);
			}
		}
		System.out.println("Count of prime number from 1 to 100 is : "+count);
	}
}
