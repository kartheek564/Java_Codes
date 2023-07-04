package P1;

import java.util.Scanner;

public class ReverseStringStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.next();
		String s2 = "";
		for (int i=s.length()-1;i>=0;i--)
		{
			 s2= s2+s.charAt(i);
		}
		System.out.println(s2);
	}
}
