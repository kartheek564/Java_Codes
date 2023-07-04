import java.util.Scanner;
class SumOddFibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n=sc.nextInt();
		int n1=0;
		int temp=n1;
		int n2=1;
		int n3=0;
		int sum=0;
		for (int i=1;i<=n ;i++ )
		{
			n3=n1+n2;
			if (n3%2==1)
			{
				System.out.print(n3+" ");
				sum=sum+n3;
			}
			n1=n2;
			n2=n3;
		}
		System.out.println(" ");
		System.out.println("Summetion of Odd digits in Fibonacci series form "+temp+" to "+n+" is :"+sum);
	}
}
