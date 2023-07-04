package P1;
import java.util.Scanner;
public class ArrayException
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the array : ");
		int[] a = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Array index : ");
		int ind = sc.nextInt();
		while(true)
		{
		try
		{
			System.out.println("The element that is present in the Index of "+ind+" in an array is "+a[ind]);
			break;
		}
		catch(ArrayIndexOutOfBoundsException abe)
		{
			System.out.println("The Actual Array size is "+a.length+" ,So please enter index value of below Array size (0-"+(a.length-1)+")");
			System.out.print("Re-enter the index value : ");
			ind = sc.nextInt();
			//System.out.println("The element that is present in the Index of "+ind+" in an array is "+a[ind]);
		}
		}
	}

}
