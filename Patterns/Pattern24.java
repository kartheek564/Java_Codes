import java.util.Scanner;
class Pattern24
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		int a=1;
		char c='a';
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==0)
				{
					System.out.print("*"+" ");
				}
				else if (i==n-1)
				{
					System.out.print("#"+" ");
				}
				else if (j==n/2)
				{
					System.out.print("0"+" ");
				}
				else if (j==0)
				{
					System.out.print("%"+" ");
				}
				else if (j==n-1)
				{
					System.out.print("$");
				}
				else if (i==n/2)
				{
					System.out.print("1"+" ");
				}
				else
				{
					if (j%2==0)
					{
						System.out.print(a+++" ");
					}
					else if(j%2==1)
					{
						System.out.print(c+++" ");
					}
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
