import java.util.Scanner;
class PrimeNumPos100
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("The first 100 prime numbers are ");
		int i,j;
		int count=0;
		for (i=1; ;i++ )
		{
			int a=i;
			for (j=2 ;j<=a ;j++ )
			{
				if (a%j==0)
				{
					break;
				}
			}
		if(a==j)
			{
				count++;
				if(count<=100)
				{
					System.out.println(j);
				}
				else
				{
					break;
				}
			}
		}
	}
}

