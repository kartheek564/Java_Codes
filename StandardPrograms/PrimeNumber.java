//a number which can divisible only 1 and itself is known as prime number
import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		boolean isPrime=true;
		for (int i=2;i<n ;i++ )
		{
			if (n%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if (isPrime)
		{
			System.out.println(n+" is a prime number ");
		}
		else 
			System.out.println(n+" is not a prime number");
	}
}
