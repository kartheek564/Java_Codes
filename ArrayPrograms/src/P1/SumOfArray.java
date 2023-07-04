package P1;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the size of an array : ");
			int n = sc.nextInt();
			int[] a = new int[n];
			System.out.println("Enter the elements of an array : ");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<n;i++)
			{					
				sum=sum+a[i];
			}
			System.out.print("The sum of Elements which are in Array is : " +sum);
		}
	}
