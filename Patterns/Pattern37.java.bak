import java.util.Scanner;
class Pattern37
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n = sc.nextInt();
		int count =1;
		int sp=n-1;
		char ch='a';
		int a=1;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<sp;j++ )
			{
				System.out.print("  ");
			}
			for (int j=0;j<count ;j++ )
			{
				if (j%2==0)
				{
					System.out.print(a++ +" ");
					if (a>9)
					{
						a=0;
					}
				}
				else
				{
					System.out.print(ch++ +" ");
				}
			}
			System.out.println();
			count+=2;
			sp--;
		}
	}
}
