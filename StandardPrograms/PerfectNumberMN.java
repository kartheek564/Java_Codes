import java.util.Scanner;
class  PerfectNumberMN
{
	public static void main(String[] args)
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the M Value: ");
		int m = sc.nextInt();
		System.out.print("Please Enter the n Value: ");
		int n = sc.nextInt();
		for(i = m; i <= n; i++) 
		{
			int Sum=0;
			int a=i;
			for(j = 1; j < a; j++)
			{
				if(a % j == 0) 
				{
					Sum = Sum + j;
				}
			}
			if (Sum == i) 
			{
				System.out.println( i+" ");
			}
		}
	}
}
