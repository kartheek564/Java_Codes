package P1;
import java.util.*;
public class ArrayDoyble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements : ");
		double[] a = new double[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextDouble();
		}
		System.out.println("Given array elements are : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
