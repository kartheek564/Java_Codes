package P1;
import java.util.*;
public class NoofAplhaInString {
		public static void main(String[] args) {
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter the string  : ");
			String s = sc.next();
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z')
				{
					count++;
				}
			}
			System.out.println("No of Alphabets present in the String is : "+count);
		}
	}
