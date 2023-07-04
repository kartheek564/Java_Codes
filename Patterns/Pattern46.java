import java.util.Scanner;
class Pattern46 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		for (int i=0;i<n ;i++ )
		{
			int a =1;
			char c= 'A';
			for (int j=0;j<n ;j++ )
			{
				if (i+j>=n-1)
				{
					if (i%2==0)
					{
						System.out.print(c++ +" ");
						
					}
					else
						System.out.print(a++ +" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
