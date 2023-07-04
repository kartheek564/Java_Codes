import java.util.Scanner;
class Pattern28
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ )
		{
			int a=i+1;
			for (int j=0;j<n ;j++ )
			{
					System.out.print(a+" ");
					a=a+n;	
			}
			System.out.println();
		}
	}
}
