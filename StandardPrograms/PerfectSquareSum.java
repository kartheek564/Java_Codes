import java.util.Scanner;
class  PerfectSquareSum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int sum=0,temp=n,sum1=0;
		boolean status=false;
		for (int i=1;i<(n/2);i++ )
		{
			if (i*i==n)
			{
				status=true;
			}
		}
		if (status)
		{
			System.out.println(n+" is a Perfect Square Number ");
			while (n!=0)
			{
				int digit=n%10;
				sum=sum+digit;
				n=n/10;
			}
			for (int i=1;i<sum ;i++ )
			{
				if (sum%i==0)
				{
					sum1=sum1+i;
				}
			}
			if (sum1==sum)
				{
					System.out.println(sum+" is a perfect number ");
				}
			else
				{
					System.out.println(sum+" is not a perfect number");
				}
		}
		else
		{
			System.out.println(n+" is a not Perfect Square Number !!");
			while (n!=0)
			{
				int digit=n%10;
				sum=sum+digit;
				n=n/10;
			}
			System.out.println("The sum of given number "+temp+" is "+sum);
		}
	}
}
