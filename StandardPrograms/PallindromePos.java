import java.util.Scanner;
class PallindromePos
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Position ");
		int pos = sc.nextInt();
		int count=0;
		for (int i=1; ;i++ )
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
				count++;
			}
			if (count==pos)
			{
				System.out.println(rev);
				break;
			}
		}
	}
}