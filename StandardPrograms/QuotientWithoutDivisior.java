import java.util.Scanner;
class  QuotientWithoutDivisior
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter divident number");
		int m = sc.nextInt();
		System.out.println("Enter divisior number");
		int n = sc.nextInt();
		int count=0;
		while (m>=n)
		{
			m=m-n;
			count++;
		}
		System.out.println(count);
	}
}
