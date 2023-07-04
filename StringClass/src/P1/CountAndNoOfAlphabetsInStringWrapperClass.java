package P1;

import java.util.Scanner;

public class CountAndNoOfAlphabetsInStringWrapperClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		int count = 0;
		for(int i=0 ;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(Character.isAlphabetic(c))
			{
				count++;
				System.out.print(c+" ");
			}
			/*Boolean b = Character.isDigit(c);
			if(b)
			{
				System.out.println(c);
			}*/
		}
		System.out.println();
		System.out.println("No of Alphabets present in a String is : "+count);

	}

}
