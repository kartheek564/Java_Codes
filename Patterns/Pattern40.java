import java.util.Scanner;
class Pattern40
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n = sc.nextInt();
		int count =1;
		int sp=n-1;
		for (int i=0;i<n ;i++ )
		{
			char ch='A';
			for (int j=0;j<sp;j++ )
			{
				System.out.print("  ");
			}
			for (int j=0;j<count ;j++ )
			{
					System.out.print(ch +" ");
					if (j<count/2)
					{
						ch++;
					}
				else
				{
					ch--;
				}
			}
		count+=2;
		sp--;
		System.out.println();
		}
		}
	}

