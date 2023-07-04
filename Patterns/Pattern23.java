import java.util.Scanner;
class Pattern23
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		int a=1;
		int b=1;
		char c='A';
		char ch='a';
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i%2==0)
				{
				System.out.print(a++);
				System.out.print(c++ +" ");
				}
				else
				{
				System.out.print(ch++);
				System.out.print(b++ +" ");
				}
			}
			System.out.println();
		}
	}
}
