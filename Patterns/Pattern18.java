import java.util.Scanner;
class Pattern18 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		int a=1;
		char c='a';
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i%2==1)
				{
					System.out.print(j+1 +" ");
				}
				else
				{
					System.out.print((char)(j+97) +" ");
				}
			}
			System.out.println();
		}
	}
}



