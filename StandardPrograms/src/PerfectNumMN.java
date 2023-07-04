import java.util.*;
public class PerfectNumMN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the M Value: ");
		int m = sc.nextInt();
		System.out.print("Please Enter the N Value: ");
		int n = sc.nextInt();
		for(int i = m; i <= n; i++) 
		{
			int Sum=0;
			int a=i;
			for(int j = 1; j < a; j++)
			{
				if(a % j == 0) 
				{
					Sum = Sum + j;
				}
			}
			if (Sum == i) 
			{
				System.out.println( i+" ");
			}
		}
	}
}
