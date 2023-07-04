package P1;
import java.util.Scanner;
public class ExceptionInt
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the x value :");
		int x = sc.nextInt();
		System.out.print("Enter the y value :");
		int y = sc.nextInt();
		int result;
		while(true)
		{
		try
		{
			result = x/y;
			System.out.println("The result is :"+result);
			break;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Please enter the valid inputs ");
			System.out.print("Renter the x value :");
			x = sc.nextInt();
			System.out.print("Renter the y value :");
			y = sc.nextInt();
			//result = x/y;
			//System.out.println("The result is :"+result);
		}
		}
	}
}