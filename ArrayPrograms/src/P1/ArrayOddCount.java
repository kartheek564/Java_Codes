package P1;
import java.util.*;
public class ArrayOddCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.print("Enter the size of an array : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of an array : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The Odd elements of given Array : ");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==1)
			{
				count++;
				System.out.println(a[i]);
			}
		}
		System.out.println("The count of odd numbers present in an array is : "+count);
	}
}
