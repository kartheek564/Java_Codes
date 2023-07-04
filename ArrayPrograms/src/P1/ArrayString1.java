package P1;
import java.util.*;
public class ArrayString1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array : ");
		int n = sc.nextInt();
		String[] s = new String[n];
		System.out.println("Enter the String Elements : ");
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		System.out.println("Given Strings are : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(s[i]+" || ");
		}
	}

}
