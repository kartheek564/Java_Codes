import java.util.Scanner;
class Div37MNDecOrder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		System.out.println("The numbers which are divisible by 3 and 7 between m and n is:");
		for (int i=n;i>=m ;i-- )
		{
			if (i%3==0&&i%7==0)
			{
				System.out.println(i);
			}
		}
	}
}
