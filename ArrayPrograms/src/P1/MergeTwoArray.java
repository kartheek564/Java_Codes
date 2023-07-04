package P1;
import java.util.*;
public class MergeTwoArray {

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
		int[] a3 = new int[a1.length+a2.length];
		int count=0;
		for(int i=0;i<a1.length;i++)
		{
			a3[count++]=a1[i];
		}
		for(int j=0;j<a2.length;j++)
		{
			a3[count++]=a2[j];
		}
		System.out.println("The merge of two array's is : ");
		for(int i=0;i<a3.length;i++)
		{
			System.out.print(a3[i]+" ");
		}
	}
}