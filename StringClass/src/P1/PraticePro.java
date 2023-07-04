package P1;

import java.util.Scanner;

public class PraticePro
{
	static Scanner sc  = new Scanner(System.in);
	static String s;
	public static void main(String[] args)
	{
		System.out.println("Enter your name : ");
		s = sc.next();
//		System.out.println("Your name is :"+s);
		for (int i=s.length()-1;i>=0;i++)
		{
			System.out.print(i+"");
		}
	}
}
