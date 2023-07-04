import java.util.Scanner;
class Pattern32
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		int a=1;
		for (int i=0;i<n ;i++ )
		{
			a=a+i+1;
			int k=a		;
			for (int j=0;j<n ;j++ )
			{
				if (i>=j)
				{
					System.out.print(--k +" ");	
				}
			}
			System.out.println();
		}
	}
}
