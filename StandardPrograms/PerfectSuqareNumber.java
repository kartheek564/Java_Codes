//The number is square root of any number is known as perfect square
import java.util.Scanner;
class PerfectSuqareNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : " );
		int n=sc.nextInt();
		int sum=0;
		boolean status=false;
		for (int i=1;i<(n/2)+1 ;i++ )
		{
			if (i*i == n)
			{
				status=true;
				break;
			}
		}
		if (status)
		{
			System.out.println(n+" is a perfect square number!");
		}
		else
			System.out.println(n+" is not a perfect square number!");
	}
}
