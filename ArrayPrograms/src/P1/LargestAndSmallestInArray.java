package P1;

import java.util.Scanner;

public class LargestAndSmallestInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements to array: ");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int large=a[0];
		int small= a[0];
		for(int i=1;i<n;i++)
		{
		if(large<a[i])
		large=a[i];
		else if(small>a[i])
		small=a[i];
		}
		System.out.println("Largest is : "+large);
		System.out.println("Smallest is :"+small);
	}
		
	}
