import java.util.*;
public class SumPallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println("The sum of given number is :"+sum);
		int rev=0;
		int temp=sum;
		while(sum!=0)
		{
			int digit=sum%10;
			rev=rev*10+digit;
			sum=sum/10;
		}
		if(temp==rev)
		{
			System.out.println(temp+" is pallindrome number");
		}
		else
			System.out.println(temp+" is not a pallidrome number");
	}
}