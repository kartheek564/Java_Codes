import java.util.Scanner;
class DigitProduct 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int product=1;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			product=product*digit;
		}
		System.out.println("The product of given number digits is " + product);
	}
}
