import java.util.Scanner;
class ArmstrongNumPos
{
    public static void main(String args[])
    {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the position value : ");
		int pos = scanner.nextInt();
		int a,temp,count=0,z=0,sum=0;
		for(int i=1; ;i++)
		{
			a=i;
			temp=i;
			sum=0;
			count=0;
			while(a>0)
			{
				count++;
				a=a/10;
			}
			while(temp>0)
			{
				int power=1;
				int digit=temp%10;
				for(int j=1;j<=count;j++)
				{
					power*=digit;
				}
					
				sum+=power;
				temp/=10;	
			}
			if(sum==i)
			{
			z++;
			}
			if(z==pos&&sum==i)
			{
				System.out.println(i+" "+" ");
				break;
			}
		}
	}
}

