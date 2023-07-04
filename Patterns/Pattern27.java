import java.util.Scanner;
class Pattern27
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		int a=1;
		for (int i=1;i<=n ;i++)
		{
			for (int j=1;j<=n ;j++)
			{
				if(i>=j)
				{
					System.out.print(a +" ");
					a++;
				}
			}
			System.out.println();
		}
	}
}
