import java.util.Scanner;
class Pattern1 
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
				if (i==1&&j==1||i==3&&j==0)
				{
					System.out.print("1");
				}
				else if (i==2&&j==3||i==3&&j==2)
				{
					System.out.print("2");
				}
				else 
				{
					System.out.print("A");
				}
			}
			System.out.println();
		}
	}
}
