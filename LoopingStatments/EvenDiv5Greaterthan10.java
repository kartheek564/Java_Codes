import java.util.Scanner;
class  EvenDiv5Greaterthan10
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		System.out.println("The Even numbers which are divisible by 5 which is greater than 10 between "+m+" and "+n+" is :");
		for (int i=m;i<=n ;i++ )
		{
			if (i%2==0&&i%5==0&&i>=5)
			{
					System.out.println(i);
			}
		}
	}
}
