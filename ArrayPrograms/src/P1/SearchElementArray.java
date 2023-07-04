package P1;

import java.util.Scanner;

public class SearchElementArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int flag=0;
		System.out.println("Enter array Elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the Element to search : ");
		int key = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Element found");
		}
		else
			System.out.println("Element not found");
	}
}
