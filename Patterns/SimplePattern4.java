import java.util.Scanner;
class SimplePattern4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<=n ;j++ )
			{
				if (j==n)
				{
					System.out.print("@"+" ");
				}
				else
				{
				System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}
}
