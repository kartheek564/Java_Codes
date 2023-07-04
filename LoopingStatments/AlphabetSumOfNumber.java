import java.util.Scanner;
class  AlphabetSumOfNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int sum=0;
		while (n!=0)
		{
			if (sum>0&sum<=26)
			{
			int digit=n%10;
			n=n/10;
			sum=sum+digit;
			System.out.println(sum);
			System.out.println((char)(sum+64));
			}
		}
		System.out.println((char)(sum+64));
	}
}
