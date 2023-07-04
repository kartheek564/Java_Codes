import java.util.Scanner;
class SumofPerfectNumberMN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m=sc.nextInt();
		System.out.println("Enter n value : ");
		int n=sc.nextInt();
		int sum=0;
		int p=0;
		for (int i=m;i<=n ;i++ )
		{
			sum=sum+i;
		}
		System.out.println(sum);
		for (int i=1;i<n ;i++ )
		{
			if (i%sum==0)
			{
				p=p+sum;
			}
		}
		if (p==sum)
		{
			System.out.println(sum+" is a perfect number");
		}
		else
			System.out.println(sum+" is a not  perfect number");
	}
}
