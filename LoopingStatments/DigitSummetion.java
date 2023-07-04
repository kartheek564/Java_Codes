import java.util.Scanner;
class DigitSummetion 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int sum=0;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			sum=sum+digit;
		}
		System.out.println("The summetion of given number digits is " + sum);
	}
}
