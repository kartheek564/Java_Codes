import java.util.Scanner;
class Pattern21
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		char c='A';
		for (int i=0;i<n ;i++ )
		{
			int a=9;
			for (int j=0;j<n ;j++ )
			{
				if(i%2==0)
				{
					if (c>'N')
					{
						c='A';
					}
					System.out.print(c +" ");
					c+=2;
				}
				else
				{
					System.out.print(a + " ");
					a=a-2;
				}

			}
			System.out.println();
		}
	}
}
