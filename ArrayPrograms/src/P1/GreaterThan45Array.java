package P1;
import java.util.*;
public class GreaterThan45Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int count=0;
		System.out.println("Enter the elements of an array : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The elements which are greater than 45 in array is : ");
		for(int i=0;i<n;i++)
		{
			if(a[i]>45)
			{
				count++;
				System.out.println(a[i]);
			}
		}
		System.out.println("Count is : "+count);
	}

}
