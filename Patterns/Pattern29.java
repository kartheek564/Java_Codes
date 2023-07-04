import java.util.Scanner;
class Pattern29
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ )
		{
			int a=i+1;
			int x=n-1;
			for (int j=0;j<n ;j++ )
			{
				if (i>=j)
				{
					System.out.print(a+" ");
					a+=x;	
				}
			}
			System.out.println();
		}
	}
}
