import java.util.Scanner;
class StrongNumberMN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter m value : ");
        int m=sc.nextInt();
        System.out.print("Enter n value : ");
        int n=sc.nextInt();
		System.out.println("Strong numbers between "+m+" and "+n+" are:");
		for(int i=m;i<=n;i++)
		{
			int a=i;
			int b=i;
			int sum=0;
			while(b!=0)
			{   
				int fact=1;
				int digit=b%10;
				for(int j=1;j<=digit;j++)
				{
				fact=fact*j;
				}
				sum=sum+fact;
				b=b/10;
			}
			if(sum==a)
			System.out.println(i+" ");
		}
	}
}