package P1;
import java.util.*;
public class CharAtProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s1 = sc.nextLine();
		for(int i=0;i<=s1.length()-1;i++)
		{
			System.out.print(s1.charAt(i)+" ");	
		}
	}
}