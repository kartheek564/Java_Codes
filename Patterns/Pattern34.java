import java.util.Scanner;
class Pattern34 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n = sc.nextInt();
		int count =2*n-1;
		int sp=0;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<sp ;j++ )
			{
				System.out.print("  ");
			}
		for (int k=0;k<count ;k++ )
		{
			System.out.print("* ");
		}
		count=count-2;
		sp++;
		System.out.println();
		}
	}
}