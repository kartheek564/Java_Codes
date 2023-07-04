package P1;
import java.util.*;
public class RemoveDupString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		System.out.println("old string "+str);
		String newStr = "";
		String newStr1="";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(newStr.indexOf(ch)==-1)
			{
				newStr+=ch;
			}
			else
			{
				count++;
				char ch1 = str.charAt(i);
				if(newStr1.indexOf(ch1)==-1)
				{
					newStr1+=ch1;
				}
			}
		}	
		System.out.println("new string "+newStr);
		System.out.println("Repeated Values are :"+newStr1+" ");
		System.out.println("Count of duplicate characters is : "+count);
	}
}