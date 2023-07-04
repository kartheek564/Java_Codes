//The number is square root of any number is known as perfect square
import java.util.Scanner;
class  SunnyNumberPos
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position : ");
		int pos=sc.nextInt();
		int i,j,count=0;
		for ( i=1;;i++ )
		{
			int a=i;
			for ( j=1;j<=(a/2)+1 ;j++ )
			{
				if (j*j==a+1)
					{
						count++;	
					}
			}
			if(count==pos)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
