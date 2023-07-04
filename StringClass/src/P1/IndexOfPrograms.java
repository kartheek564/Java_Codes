package P1;

import java.util.Scanner;

public class IndexOfPrograms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.next();
		System.out.print("Enter the Character : ");
		char c = sc.next().charAt(0);
		int indexPosition = s.indexOf(c);
		int indexPosition1 = s.indexOf(c,6);
		System.out.println("The index position of given Character is : "+indexPosition);
		System.out.println("The index position of given Character is at a given position is : "+indexPosition1);
	}

}
