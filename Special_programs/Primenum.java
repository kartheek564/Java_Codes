import java.util.Scanner;
class Primenum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		boolean isprime=true;
		for (int i=2;i<n ;i++ )
		{
			if (n%i==0)
			{
				isprime =false;
			}
		}
		if (isprime)
		{
			System.out.println(n+" is a prime number");
		}
		else
			System.out.println(n+" is a not prime number");
	}
}
