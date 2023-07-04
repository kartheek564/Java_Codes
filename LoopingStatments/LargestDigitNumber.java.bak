import java.util.Scanner;
class LargestDigitNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int largest=0;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			if (largest<digit)
			{
				largest=digit;
			}
		}
		System.out.println(largest);
	}
}
