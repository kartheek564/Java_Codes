import java.util.*;
public class LargestNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n = sc.nextInt();
		int largest = 0;
		int smallest = 9;
		while(n!=0)
		{
			int digit=n%10;
			if(largest<digit)
			{
				largest=digit;
			}
			else
			{
				smallest=digit;
			}
			n=n/10;
		}
		System.out.println("The largest number is "+largest);
		System.out.println("The smallest number is "+smallest);
	}

}
