import java.util.Scanner;
class ArmStrongNumMN
{
    public static void main(String args[])
    {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the m value : ");
		int m = scanner.nextInt();
		System.out.print("Enter the n value : ");
		int n = scanner.nextInt();
		int z=0;
		int i,j;
		for(i=m; i<=n; i++)
		{
			int sum=0;
			int a=i;
			int temp=i;
			int count=0;
			while(a!=0)
			{
				count++;
				a = a/10;
			}
			while (temp!=0)
			{
				int digit=temp%10;
				int power=1;
				for ( j=1;j<=count ;j++ )
				{
					power=power*digit;
				}
				sum=sum+power;
				temp=temp/10;
			}
			if(sum==i)
			{
			System.out.println(i+" ");

			}
		}
		
	}
}