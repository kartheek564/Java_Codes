import java.util.Scanner;
class Pattern45  
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		int a =1;
		char c = 'A';
		for (int i=0;i<n ;i++ )
		{
			for (int j =0;j<=n ;j++ )
			{
				if (j==n/2)
				{
					System.out.print("+ ");
				}
				else if (j%2==0)
				{
					System.out.print(a+" ");
					a+=2;
					if (a>9)
					{
						a=1;
					}
				}
				else 
				{
					System.out.print(c+" ");
					c+=2;
					if (c>'I')
					{
						c='A';
					}
				}
			}
			System.out.println();
		}
	}
}
