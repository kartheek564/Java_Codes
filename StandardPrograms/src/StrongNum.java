import java.util.*;
public class StrongNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int fact=1;
			int digit=n%10;
			for(int i=1;i<=digit;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+" is a strong number");
		}
		else
			System.out.println(temp+" is not a strong number");
	}
}
