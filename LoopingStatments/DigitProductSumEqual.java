import java.util.Scanner;
class DigitProductSumEqual
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
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
			System.out.println("The product and sum given number is Equal");
		}
		else
			System.out.println("The product and sum given number is Not equal");
	}
}
