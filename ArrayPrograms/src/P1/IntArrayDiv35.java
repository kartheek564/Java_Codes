package P1;
import java.util.*;
public class IntArrayDiv35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array :");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The elements which are divisible by 3 and 5 are : ");
		for(int i=0;i<n;i++)
		{
			if(a[i]%3==0&&a[i]%5==0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
