import java.util.Scanner;
class PatternK
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (j==0)
				{
					System.out.print("| ");
				}
				else if (i+j==n-1&&i<=n/2)
				{
					System.out.print("* ");
				}
				else if (i==j&&i>=n/2)
				{
					System.out.print("* ");
				}
				else
				{
				System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
