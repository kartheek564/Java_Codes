import java.util.Scanner;
class Pattern35 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n = sc.nextInt();
		int count =1;
		int sp=n-1;
		char ch='A';
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<sp;j++ )
			{
				System.out.print("  ");
			}
			for (int j=0;j<count ;j++ )
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
			count+=2;
			sp--;
		}
	}
}
