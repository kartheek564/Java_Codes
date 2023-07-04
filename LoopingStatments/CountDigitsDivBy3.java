import java.util.Scanner;
class  CountDigitsDivBy3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			if (digit%3==0)
			{
				count++;
			}
		}
		System.out.println("The digits which are divisible by three(3) in the number "+temp+" is "+count);
	}
}