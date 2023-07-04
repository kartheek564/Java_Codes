import java.util.Scanner;
class PrimeSumOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		int sum=0;
		while (n!=0)
		{

			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println("Summetion of the given number is :"+sum);
		boolean p=true;
		for (int i=2;i<sum ;i++ )
		{
			if (sum%i==0)
			{
				p=false;
				break;
			}
		}
		if (p)
		{
			System.out.println(sum+" is prime");
		}
		else
			System.out.println(sum+" is not prime");
	}
}
