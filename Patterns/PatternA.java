import java.util.Scanner;
class PatternA
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
				if (i==n/2||i==0)
				{
					System.out.print("- ");
				}
				else if (j==0||j==n-1)
				{
					System.out.print("| ");
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
