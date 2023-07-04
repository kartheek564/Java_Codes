package P1;
import java.lang.reflect.Array;
import java.util.*;
public class Array1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size = sc.nextInt();
		System.out.println("Enter the elements of an array : ");
		int[] a = new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Given elements of an array are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Given elements of an array in Reversing order is :");
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	
	}
}
