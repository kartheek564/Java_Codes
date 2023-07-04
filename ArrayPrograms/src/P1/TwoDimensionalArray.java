package P1;
import java.util.Scanner;
public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row size : ");
		int r  =sc.nextInt();
		System.out.print("Enter the column size : ");
		int c  =sc.nextInt();
		System.out.println("Enter the Elements to an array : ");
		int[][] a = new int[r][c];
		/*int[][] a = {
		            {1, -2, 3}, 
		            {-4, -5, 6, 9}, 
		            {7}, 
		        };*/
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("The given Array elements are : ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
