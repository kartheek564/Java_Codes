package P1;
import java.util.Scanner;
public class RemoveElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size :" );
		int size = sc.nextInt();
		System.out.println("Enter the array elements : ");
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the Element to Remove : ");
		int rem = sc.nextInt();
		int count = 0 ;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==rem) {
				count++;
			}
		}
		int b[] = new int[a.length-count];
		int index = 0 ;
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=rem) {
				b[index++] = a[i];
			}
		}
		System.out.println("Elements are : ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
}
