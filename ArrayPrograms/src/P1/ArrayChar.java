package P1;
import java.util.*;
public class ArrayChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Your Name : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of an array : ");
		char[] c = new char[n];
		for(int i=0;i<n;i++)
		{
			c[i]=sc.next().charAt(0);
		}
		System.out.print("Given Characters is : "+"  ");
		for(int i=0;i<n;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
