package P1;
import java.util.*;
public class CountUpperLowerVowelsString {

	public static void main(StringP[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		int count=0;
		String s2;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				s2=""+s.charAt(i)+1;
				count++;
			}
		}
		System.out.println("The count of the Vowels which are present in Given String is : "+count);
	}
}


