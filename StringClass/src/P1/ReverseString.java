package P1;
import java.util.*;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s1 = sc.nextLine();
		System.out.println("The reversing order of the given string is");
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i)+" ");
		}
	}
}
