import java.util.Scanner;
class  EvenOddMN
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		System.out.println("Even numbers");
		System.out.println("==================");
		for (int i=m;i<=n ;i++ )
		{
			if(i%2==0)
			{
				System.out.println(i);

			}
		}
		System.out.println("Oddven numbers");
		System.out.println("==================");
		for (int i=m;i<=n ;i++ )
		{
			if(i%2==1)
			{
				System.out.println(i);

			}
		}
	}
}
