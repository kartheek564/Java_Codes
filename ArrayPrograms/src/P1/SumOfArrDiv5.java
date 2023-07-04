package P1;

import java.util.Scanner;

public class SumOfArrDiv5 {

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
		System.out.println("The elements which are Divisible by 5 in array is : ");
		for(int i=0;i<n;i++)
		{
			if(a[i]%5==0)
			{
				System.out.println(a[i]);
				sum=sum+a[i];
			}
		}
		System.out.print("The sum of Elements which are divisible by 5 are : " +sum);
	}

}
