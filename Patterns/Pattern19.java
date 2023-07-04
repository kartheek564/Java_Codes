import java.util.Scanner;
class Pattern19
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		int a=0;
		char c='A';
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i%2==1)
					{
					System.out.print(j +" ");
					}
				
				else
					{
					System.out.print(c++ +" ");
					}
				
			}
			System.out.println();
		}
	}
}
