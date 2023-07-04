package P1;
import java.util.*;

public class PallindromeString {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the String : ");
	String s1 = sc.next();
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		char ch = s1.charAt(i);
		s2=s2+ch;
	}
	if(s1.equalsIgnoreCase(s2))//It ignores Camel and Pascel casing and compares the data 
	{
		System.out.println(s2+" is  Pallindrome");
	}
	else
		System.out.println(s2+" is not pallindrome");
	}
}
