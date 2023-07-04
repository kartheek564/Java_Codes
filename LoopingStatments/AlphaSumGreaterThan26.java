import java.util.*;
class  AlphaSumGreaterThan26
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int sum=0;
		int sum1=0;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			sum=sum+digit;
		}
		if (sum<=26)
		{
			System.out.println((char)(sum+64));
		}
		else
		{
		int temp=sum;
		while (temp!=0)
		{
			int digit=temp%10;
			temp=temp/10;
			sum1=sum1+digit;
		}
		System.out.println((char)(sum1+64));
		}
	}
}
