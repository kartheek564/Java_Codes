import java.util.*;
class  LargestDigitNumGreaterThan7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int large=0;
		while (n!=0)
		{
			int digit=n%10;
			if (large<digit)
			{
				if (digit>7)
				{
					large=digit;
				}
			}
			n=n/10;
		}
		System.out.println(large);
	}
}