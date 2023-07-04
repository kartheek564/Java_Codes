import java.util.Scanner;
class Pattern42
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		int a=16;
		for (int i=0;i<n ;i++ )
		{
			a=a-(n-i);
			int x=a;
			for (int j=0;j<n ;j++ )
			{
				if (i+j<=n-1)
				{
					System.out.print(x++ +" ");	
				}
			}
			System.out.println();
		}
	}
}
