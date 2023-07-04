package P1;
import java.util.*;
public class Linear_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag=0;
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter key value to search : ");
		int key = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(key==a[i])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Key Found");
		}
		else
			System.out.println("Key Not Found");
	}
}
