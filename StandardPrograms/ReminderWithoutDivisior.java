import java.util.Scanner;
class  ReminderWithoutDivisior
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter divident number");
		int m = sc.nextInt();
		System.out.println("Enter divisior number");
		int n = sc.nextInt();
		while (m>=n)
		{
			m=m-n;
		}
		System.out.println(m);
	}
}
