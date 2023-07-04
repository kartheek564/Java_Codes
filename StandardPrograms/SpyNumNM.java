import java.util.Scanner;
class SpyNumNM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m=sc.nextInt();
		System.out.println("Enter n value : ");
		int n=sc.nextInt();
		for (int i=m;i<=n;i++ )
		{
				int sum=0,product=1;
				int a=i;
				while (a!=0)
				{
				int digit=a%10;
				sum=sum+digit;
				product=product*digit;
				a=a/10;
				}
			if (sum==product)
			{
				System.out.println(i);	
			}
		}
	}
}
