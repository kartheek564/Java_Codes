import java.util.Scanner;
class Count35 
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
			if (i%3==0&&i%5==0)
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("The Count of the numbers which are divisible by 3 and 5 is : "+count);
	}
}
