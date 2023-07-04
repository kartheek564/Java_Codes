import java.util.Scanner;
class  Pattern44
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		int a=0;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ; j++)
			{
				if (i%2==0)
				{
					System.out.print(++a +" ");
				}
				else
				{
					System.out.print(a-- +" ");
				}

			}
			System.out.println();
			a+=4;
		}
	}
}
