import java.util.Scanner;
class Pattern48
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		int count=2*n-1;
		int sp=1;
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
			sp++;
			count-=2;
			System.out.println();
		}
	}
}	
