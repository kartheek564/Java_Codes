import java.util.Scanner;
class Pattern39
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n = sc.nextInt();
		int count =1;
		int sp=n/2;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<sp;j++ )
			{
				System.out.print("  ");
			}
			for (int j=0;j<count ;j++ )
			{
					System.out.print("* ");
			}
					if (i<n/2)
					{
						count=count+2;
						sp--;
					}
				else
				{
					count-=2;
					sp++;
				}
			System.out.println();
		}
		}
	}

