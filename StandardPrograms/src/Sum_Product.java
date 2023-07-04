import java.util.*;
public class Sum_Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n =sc.nextInt();
		int sum=0;
		int product=1;
		int temp=n;
		while(n!=0)
		{
			int digit=n%10;
			sum=sum+digit;
			product=product*digit;
			n=n/10;
		}
		System.out.println("sum of the given number "+temp+" is :"+sum);
		System.out.println("product of given number "+temp+" is : "+product);
	}

}
