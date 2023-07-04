//To check given Character is present in a string or not 
package P1;
import java.util.Scanner;
public class CharPresentInString 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.next();
		System.out.println("Enter the Character : ");
		char c = sc.next().charAt(0);
		int flag=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==c)
			{
				
				flag=1;
				break;
				
			}	
		}
		if (flag==1)
			System.out.println("Given character is  present in a String ");
		else
			System.out.println("Given character is not present in a String ");
	}
}
