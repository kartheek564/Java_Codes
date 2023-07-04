package P1;
import java.util.*;
public class NoOfDigitsInString
{
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the string  : ");
		String s = sc.next();
		int count=0;
		System.out.print("The numbers present in a given string is :");
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48&&s.charAt(i)<=57)
			{
				System.out.print(s.charAt(i)+" ");
				count++;
			}
		}
		System.out.println(" ");
		System.out.println("No of digits present in the String is : "+count);
	}
}