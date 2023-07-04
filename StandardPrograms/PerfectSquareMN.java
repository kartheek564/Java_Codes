import java.util.Scanner;
class PerfectSquareMN
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter m value :");
		int m=sc.nextInt();
		System.out.print("Enter n value :");
		int n=sc.nextInt();
		int a,sun=0;
		for(int i=m;i<=n;i++)
		{
			a=i;
			for(int j=1;j<=(a/2)+1;j++)
			{
				if(j*j==a)
				{
					System.out.println(i);
				}

			}
		}
	}
}