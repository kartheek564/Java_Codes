import java.util.Scanner;
class Pattern30
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		char c='A';
		char ch='a';
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				System.out.print(c++ +" ");
				if (c=='K')
				{
					c='a';
				}
				
			}
			System.out.println();
		}
	}
}
