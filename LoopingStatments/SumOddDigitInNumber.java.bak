import java.util.Scanner;
class  SumOddDigitInNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			if (digit%2==1)
			{
				sum=sum+digit;
			}
		}
		System.out.println("Summetion odd digits in the number "+temp+" is :"+ sum);
	}
}