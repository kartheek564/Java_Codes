import java.util.Scanner;
class Pattern31
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		char c='A';
		for (int i=0;i<n ;i++ )
		{
			c=(char)(c+i+1);
			char k=c;
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