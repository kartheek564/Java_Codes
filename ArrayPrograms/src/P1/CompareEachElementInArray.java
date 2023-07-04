package P1;
import java.util.*;
public class CompareEachElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of 1st Array : ");
		int n = sc.nextInt();
		int[] a1 = new int[n];
		for(int i=0;i<n;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.print("Enter the size of 2nd Array : ");
		int n1 = sc.nextInt();
		int[] a2 = new int[n1];
		for(int i=0;i<n1;i++)
		{
			a2[i]=sc.nextInt();
		}
		int count=0;
		int i,j;
		//System.out.println("Repeated values are : ");
		//System.out.println("Not Repeated values are : ");
		for( i=0;i<a1.length;i++)
		{
			for( j=0;j<a2.length;j++)
			{
				if(a1[j]==a2[i])
				{
					count++;
					System.out.println(a1[i]+" are Repeated");
					break;
				}
				else
				{
					System.out.println(a1[i]+" "+a2[i]+" are not Repeated");	
					break;
				}
			}
		}
		System.out.println("Repeated Elememt count is "+count);
	}
}
