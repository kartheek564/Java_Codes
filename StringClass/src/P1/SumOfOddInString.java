package P1;

import java.util.Scanner;

public class SumOfOddInString
{
public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the String:");
	String s = sc.next();
	int sum = 0;
	for(int i=0;i<s.length();i++)
	{
		char ch = s.charAt(i);
		if(Character.isDigit(ch))
		{
			int a = Integer.parseInt(ch+"");
			if(a%2==1)
			{
				sum=sum+a;
			}
		}
	}
	System.out.print("Sum of odd digits in a String is: "+sum);
	}
}
