package P1;
import java.util.*;
public class RemoveDupEleArray 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int a1[] = new int[n];
		System.out.println("Enter the elements to array: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array after removing elements From Array : ");
		for(int i=0;i<n;i++)
		{
	        a1[a[i]]++;
	        if(a1[a[i]]==1)
	        {
	            System.out.println(a[i]);
	        }
	    }
	  }
}