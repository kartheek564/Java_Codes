//After adding 1 to any number of the number is perfect square is known as sunny number
import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		int sum=0;
		boolean status=false;
		for (int i=1;i<=(n/2)+1 ;i++ )
		{
			if (i*i == n + 1)
			{
				status=true;
			}
		}
		if (status)
		{
			System.out.println(n+" is a sunny number");
		}
		else
			System.out.println(n+" is not a sunny number");
	}
}
