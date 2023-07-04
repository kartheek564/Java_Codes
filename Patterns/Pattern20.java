import java.util.Scanner;
class Pattern20
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		char c='a';
		for (int i=0;i<n ;i++ )
		{
			int a=1;
			for (int j=0;j<n-1 ;j++ )
			{
				if(i%2==1)
					{
					System.out.print(c++ +" ");
					if (c=='f')
					{
						c='a';
					}
					}
				else
					{
					System.out.print(a +" ");
					a=a+2;
					}
			}

			System.out.println();
		}
	}
}
