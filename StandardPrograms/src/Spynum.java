import java.util.*;
public class Spynum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
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
		if(sum==product)
		{
			System.out.println(temp+" is a spy number");
		}
		else
			System.out.println(temp+" is not a spy number");
	}
}
