package P1;

import java.util.Scanner;

public class CountTheEachElementsArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter the size of an array : ");
		int n = 10;
		int[] a = new int[n];
		System.out.print("Enter the 5 elements to array: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==a[0])
			{
				count1++;
			}
			else if(a[i]==a[1])
			{
				count2++;
			}
			else if(a[i]==a[2])
			{
				count3++;
			}
			else if(a[i]==a[3])
			{
				count4++;
			}
			else if(a[i]==a[4])
			{
				count5++;
			}
		}
		System.out.println(a[0]+" ---> "+count1);
		System.out.println(a[1]+" ---> "+count2);
		System.out.println(a[2]+" ---> "+count3);
		System.out.println(a[3]+" ---> "+count4);
		System.out.println(a[4]+" ---> "+count5);
	}

}
