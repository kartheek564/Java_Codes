import java.util.Scanner;
class Pattern2
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
				if (i==0&&j==1||i==n&&j==0||i==n&&j==2)
				{
					System.out.print("$"+" ");
				}
				else if (i==0&&j==3||i==1&&j==3||i==3&&j==4)
				{
					System.out.print("!"+" ");
				}
				else if(i==2&&j==4||i==3&&j==0)
				{
					System.out.print("#"+" ");
				}
				else 
					System.out.print("0"+" ");
			}
			System.out.println();
		}
	}
}
