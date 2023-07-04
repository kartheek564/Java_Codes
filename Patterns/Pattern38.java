import java.util.Scanner;
class Pattern38
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n = sc.nextInt();
		int count =2*n-1;
		int sp=0;
		char ch='A';
		int a=1;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<sp;j++ )
			{
				System.out.print("  ");
			}
			for (int j=0;j<count ;j++ )
			{
				if (i%2==0)
				{
					System.out.print(ch++ +" ");
					if (ch>'I')
					{
						ch='A';
					}
				}
				
				else
				{
					System.out.print(a++ +" ");
				}
				a=a+2;
					count+=2;
			sp++;
			}
			System.out.println();
		}
	}
}
