import java.util.Scanner;
class  SumOfLargeSmall4NumIsPrime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value : ");
		int a=sc.nextInt();
		System.out.print("Enter b value : ");
		int b=sc.nextInt();
		System.out.print("Enter c value : ");
		int c=sc.nextInt();
		System.out.print("Enter d value : ");
		int d=sc.nextInt();
		int l,s,sum;
		boolean isPrime=true;
		System.out.println(a>b&&a>c&&a>d ? "Largest is "+(l=a) : b>c&&b>d ? "Largest is " + (l=b) : c>d ? "Largest is "+ (l=c) : "Largest is "+(l=d));
		System.out.println(a<b&&a<c&&a<d ? "Smallest is "+(s=a) : b<c&&b<d ? "Smallest is " + (s=b) : c<d ? "Smallest is "+ (s=c) : "Smallest is "+(s=d));
		sum=s+l;
		System.out.println("Sum of largest and smallest numbers is : "+sum);
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
			System.out.println(sum+" is a prime number");
		}
		else
			
			System.out.println(sum+" is not a prime number");
	}
}
