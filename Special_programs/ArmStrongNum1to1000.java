import java.util.Scanner;
class ArmStrongNum1to1000
{
    public static void main(String args[])
    {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Armstrong numbers from 1 to 1000 Are :");
		int count=0;
		int a;
		int sum;
		for (a=1;a<=1000;a++)
		{
			int count1=0;
			int temp=a;
			while (a!=0)
			{
				count++;
				a=a/10;
			}
			a=temp;
			 sum=0;
			while (a!=0)
			{
				int digit=a%10;
				int pow=1;
				for (int j=1;j<=a ;j++ )
				{
					pow=pow*digit;
				}
				sum=sum+pow;
				a=a/10;
			}
			a=temp;
			if (a==sum)
		{
			System.out.println(a+" ");
		}
		}
	}
	}
}