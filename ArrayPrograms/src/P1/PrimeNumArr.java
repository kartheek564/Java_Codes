package P1;
import java.util.*;
public class PrimeNumArr {
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
		for(int i=2;i<n;i++)
		{
			boolean isprime=true;
			for(int j=2;j<a[i];j++)
			{
				 if(a[i]%j==0)
				 {
					 isprime=false;
					 break;
				 }
			}
			if(isprime)
			{
				System.out.println(a[i]+" ");
			}
		}
	}

}
