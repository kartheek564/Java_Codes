import java.util.Scanner;
class PrimeNum10to100 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter m value : ");
		int m=sc.nextInt();
		int n=100
		int i,j;
		for (i=m;i<n ;i++ )
		{
			int a=i;
			for (j=2 ;j<=a ;j++ )
			{
				if (a%j==0)
				{
					break;
				}
			}
		if(a==j)
			{
				System.out.println(j);
			}
		}
	}
}
