import java.util.*;
public class ProductArmstrong {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int product=1;
		while(n!=0)
		{
			int digit = n%10;
			product=product*digit;
			n=n/10;
		}
		System.out.println("The product of given number is :"+product);
		int temp=product;
		int temp1=product;
		int temp2=product;
		int count=0;
		while(temp1!=0)
		{
			count++;
			temp1=temp1/10;
		}
		int sum=0;
		while(temp2!=0)
		{
			int power= 1;
			int digit = temp2%10;
			for(int i=1;i<=count;i++)
			{
				power = power * digit;
			}
			sum = sum+power;
			temp2=temp2/10;
		}
		if(sum==temp)
		{
			System.out.println(product+ " is a armstrong number");
		}
		else
		{
			System.out.println(product+" is not a armstrong number");
		}
	}

}
