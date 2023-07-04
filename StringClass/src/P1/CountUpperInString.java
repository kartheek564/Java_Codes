package P1;
import java.util.*;
public class CountUpperInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.next();
		int count=0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				System.out.println(s.charAt(i));
				count++;
			}
		}
		System.out.println("Count of UpperCase letters present in the String is :"+count);
	}
}
