import java.util.*;
class SumofLargestSmallestDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int temp=n;
		int sum;
		int largest=0;
		int smallest=9;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			if (largest<digit)
			{
				largest=digit;
			}
			if (smallest>digit)
			{
				smallest=digit;
			}
		}
		System.out.println("The greatest is :"+largest);
		System.out.println("The smallest is :"+smallest);
		sum=largest+smallest;
		System.out.println("The sum of smallest and largest is :"+sum);
	}
}
