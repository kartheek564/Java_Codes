import java.util.Scanner;
class Natural1ToN
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		for (int i=1;i<=n ;i++ )
		{
			System.out.println(i);
		}
	}
}
