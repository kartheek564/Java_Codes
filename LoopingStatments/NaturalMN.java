import java.util.Scanner;
class NaturalMN
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value: ");
		int m=sc.nextInt();
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		for (int i=m;i<=n ;i++ )
		{
			System.out.println(i);
		}
	}
}
