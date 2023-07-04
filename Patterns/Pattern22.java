import java.util.Scanner;
class Pattern22
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		int a=1;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				System.out.print(a+" ");
				a=a+3;
			}
			System.out.println();
		}
	}
}
