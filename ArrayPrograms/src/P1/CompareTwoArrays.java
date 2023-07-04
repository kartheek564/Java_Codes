package P1;
import java.util.*;

public class CompareTwoArrays {

	public static void main(String[] args) {
		String[] s1 = {"Kartheek","Sai","Viswa"};
		String[] s2 = {"Kartheek","Sai","Viswa"};
		if(Arrays.equals(s1, s2))
		{
			System.out.println("same");
		}
		else
			System.out.println("Not same");
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of 1st Array : ");
		int n = sc.nextInt();
		String[] a1 = new String[n];
		for(int i=0;i<n;i++)
		{
			a1[i]=sc.next();
		}
		System.out.print("Enter the size of 2nd Array : ");
		int n1 = sc.nextInt();
		String[] a2 = new String[n1];
		for(int i=0;i<n1;i++)
		{
			a2[i]=sc.next();
		}
		boolean status = false;
		for(int i=0;i<n;i++)
		{
			if(Arrays.equals(a1, a2))
			{
				status = true;
			}
		}
		if(status)
		{
			System.out.println("same");
		}
		else
			System.out.println("Not Same");*/
	}
}
