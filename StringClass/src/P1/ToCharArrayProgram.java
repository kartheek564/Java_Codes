package P1;

import java.util.Scanner;

public class ToCharArrayProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s = sc.next();
		char[] c = s.toCharArray();
		System.out.println("The no of characters present in a given String is : "+c.length);
	}
}