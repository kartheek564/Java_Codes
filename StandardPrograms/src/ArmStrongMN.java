import java.util.*;
public class ArmStrongMN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int i;
		System.out.print("Enter m value : ");
		int m = sc.nextInt();
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			int temp=i;
			int count=0;
			int sum=0;
			int a=i;
			while(a!=0)
			{
				count++;
				a=a/10;
			}
			while(temp!=0)
			{
				int pow=1;
				int digit = temp%10;
				for(int j=1;j<=count;j++)
				{
					pow=pow*digit;
				}
				sum=sum+pow;
				temp=temp/10;
			}
			if(sum==i)
			{
				System.out.println(i+" ");
			}
		}
	}

}
