import java.util.Scanner;
class CountOddMN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value: ");
		int m=sc.nextInt();
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int count=0;
		for (int i=m;i<=n ;i++ )
		{
			if (i%2==1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
