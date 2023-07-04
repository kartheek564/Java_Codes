import java.util.Scanner;
class Pattern17 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ )
		{
			char ch=(char)('a'+n-1);
			for (int j=0;j<n ;j++ )
			{
				System.out.print(ch-- +" ");
			}
			System.out.println();
		}
	}
}
