package P1;
import java.util.*;
public class Trail {
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
		
		int i,j;
		//System.out.println("Repeated values are : ");
		//System.out.println("Not Repeated values are : ");
		for( i=0;i<a1.length;i++)
		{
			int count = 0;
			for( j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					count++;
					
					
				}
				
				
			}
			if(count>=1)
			{
				System.out.println(a1[i]+" repeated "+count+" time");
			}
			else
				System.out.println(a1[i]+" not repeated");
		}
	}
}
