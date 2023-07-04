import java.util.Scanner;
class SmallestDigitNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int Smallest=0;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			if (smallest>digit)
			{
				smallest=digit;
			}
		}
		System.out.println(smallest);
	}
}
