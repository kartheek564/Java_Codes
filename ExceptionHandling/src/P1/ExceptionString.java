package P1;
import java.util.Scanner;
public class ExceptionString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String s = sc.next();
		System.out.print("Enter the index value :");
		int i = sc.nextInt();
		while(true)
		{
		try
		{
			System.out.println("The character present in the index of "+i+" is "+s.charAt(i));
			break;
		}
		catch(StringIndexOutOfBoundsException si)
		{
			System.out.println("The Actual stirng size is "+s.length()+" ,So please enter the index value of below string size (0-"+(s.length()-1)+")");
			System.out.print("Re-enter the valid index value :");
			i = sc.nextInt();
			//System.out.println("The character present in the index of "+i+" is "+s.charAt(i));
		}
		}
	}
}