import java.util.Scanner;
class SumPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		boolean isPrime=true;
		int sum=0;
		while (n!=0)
		{
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		for (int i=2;i<sum ;i++ )
		{
			if (sum%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if (isPrime)
		{
			System.out.println(sum+" is a prime number ");
		}
		else 
			System.out.println(sum+" is not a prime number");
	}
}
