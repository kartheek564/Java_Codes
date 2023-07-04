package P1;

import java.util.Scanner;

public class SumOfEvenInString {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the String : ");
	String s = sc.next();
	int sum = 0;
	for(int i=0;i<s.length();i++)
	{
		char ch = s.charAt(i);
		if(Character.isDigit(ch))
		{
			int a= Integer.parseInt(ch+"");
			if(a%2==0)
			{
				sum=sum+a;
			}
		}
	}		
	System.out.println("Sum of Even Numbers in String is :"+sum);
	}
}


/*if(s.charAt(i)>=48&&s.charAt(i)<=57)
{
String s1 = ""+s.charAt(i);
Integer a = Integer.parseInt(s1);
}*/
