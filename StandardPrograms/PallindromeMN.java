import java.util.Scanner;
class PallindromeMN 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the M Value: ");
		int m = sc.nextInt();
		System.out.print("Please Enter the n Value: ");
		int n = sc.nextInt();
		for (int i=m;i<=n ;i++ )
		{
			int rev=0;
			int a=i;
			while (a!=0)
			{
				int digit=a%10;
				rev=rev*10+digit;
				a/=10;
			}
			if (rev==i)
			{
				System.out.println(i);
			}
		}
	}
}