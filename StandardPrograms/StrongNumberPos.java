import java.util.Scanner;
class StrongNumberPos 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Position ");
        int pos=sc.nextInt();
		int i,j,count=0;
		for(i=1; ;i++)
		{
			int a=i;
			int b=i;
			int sum=0;
			while(b!=0)
			{   
				int fact=1;
				int digit=b%10;
				b=b/10;
				for(j=1;j<=digit;j++)
				fact=fact*j;
				sum=sum+fact;
			}
			if(sum==a)
			{
				count++;
			}
			if (count==pos)
			{
				System.out.println(i);
				break;
			}
		}
	}
}