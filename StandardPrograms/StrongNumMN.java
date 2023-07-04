import java.util.Scanner;
class  StrongNumMN
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter m value : ");
		int m=sc.nextInt();
		System.out.print("Enter n value : ");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int i,j;
		for (i=m;i<=n ;i++ )
		{
			int a=i;
			int a1=i;
			int fact=1;
			while (a!=0)
			{
				fact=1;
				int digit=a%10;
				for (j=1;j<=digit;j++ )
				{
					fact*=j;
				}
				sum=sum+fact;
				a=a/10;
			}
		}
		if (sum==a1)
		{
			System.out.println("The strong numbers between "+m+" and "+n +" is "+i);
		}
		}
}