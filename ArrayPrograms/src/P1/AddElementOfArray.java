package P1;
import java.util.*;
public class AddElementOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of an array : ");
		int[] a = new int[n+1];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Add element of an array : ");
		int element = sc.nextInt();
		System.out.print("Add element at position : ");
		int pos = sc.nextInt();
		for(int i=n;i>=pos;i--)
		{
			a[i]=a[i-1];
		}
		a[pos-1]=element;
		for(int i=0;i<=n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}