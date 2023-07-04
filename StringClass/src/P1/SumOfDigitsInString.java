//sum of digits in a given string 
package P1;
import java.util.*;
public class SumOfDigitsInString
{
		public static void main(String[] args)
	{
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter the string  : ");
			String s = sc.next();
			int sum=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>=48&&s.charAt(i)<=57)
				{
					String s1 = ""+s.charAt(i);
					Integer a = Integer.parseInt(s1);
					sum += a;
				}
			}
			System.out.println(sum);
	}
}
