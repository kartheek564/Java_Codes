import java.util.Scanner;
class SumEvenOddDiv3EqualOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int sum=0;
		int sum1=0;
		for (int i=m;i<=n ;i++ )
		{
			if (i%3==0)
			{
				if (i%2==0)
				{
					sum=sum+i;
				}
				else
					sum1=sum1+i;
			}
		}
		if (sum==sum1)
		{
			System.out.println("Summetion is equal");
		}
		else
			System.out.println("Summetion is not equal");
	}
}
