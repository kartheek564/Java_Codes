import java.util.Scanner;
class Pattern47 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		int count=1;
		int sp=n-1;
		for (int i=0;i<n ;i++)
		{
			for (int j=0;j<sp ;j++)
			{
				System.out.print("  ");
			}
			for (int k=0;k<count;k++ )
			{
				System.out.print("* ");
			}
			count+=2;
			sp--;
			System.out.println();
		}
	}
}