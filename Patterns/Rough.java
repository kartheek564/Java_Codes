import java.util.Scanner;
class Rough 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n=sc.nextInt();
		char c='a';
		int a=1;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i<=j)
				{
					if(i%2==0)
					{
						System.out.print(a++ +" ");
						if (a==10)
						{
							a=1;
						}
					}
					else 
					{
						System.out.print(c++ +" ");
					}
				}
				else	
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
