import java.util.Scanner;
class  SumLargestSmallestIsPrime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		int sum;
		int temp=n;
		boolean isPrime=true;
		int largest=0,smallest=9;
		while (n!=0)
		{
			int digit=n%10;
			if (largest<digit)
			{
				largest=digit;
			}
			else
			{
				smallest=digit;
			}
			n=n/10;
		}
		System.out.println("The largest of the given number "+temp+" is "+largest );
		System.out.println("The Smallest of the given number "+temp+" is "+smallest );
		sum=largest+smallest;
		System.out.println("The sum of largest "+largest+" and smallest "+smallest +" of the given numbers "+temp+" is "+sum );
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
			System.out.println(sum+" is a prime number" );
		}
		else 
			System.out.println(sum+" is not a prime number" );
	}
}
