import java.util.Scanner;
class DigitProductSumEqualEvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int temp=n;
		int product=1;
		int sum=0;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			product=product*digit;
			sum=sum+digit;
		}
		if (sum==product)
		{
			System.out.println("The product and sum of " +temp+ " is Equal");
			if (sum%2==0)
			{
				System.out.println(sum+" is Even");
			}
			else
				System.out.println(sum+" is Odd");
		}
		else
		{
			System.out.println("The product and sum of " +temp+ " is Not equal");
		if (product%2==0)
			{
				System.out.println(product+" is Even");
			}
			else
				System.out.println(product+" is Odd");
		}
	}
}
