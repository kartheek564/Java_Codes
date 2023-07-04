import java.util.Scanner;
public class StrongNumberInRange 
	{
		public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
		int m, n, i;
        System.out.println("Enter m value : ");
        m=cs.nextInt();
        System.out.println("Enter n value : ");
        n=cs.nextInt();
		System.out.println("Strong numbers between "+m+" and "+n+" are:");
		for(i=m;i<=n;i++)
		{
			int a=i;
			int b=i;
			int sum=0;
			while(b!=0)
			{   
				int fact=1;
				int digit=b%10;
				b=b/10;
				for(int j=1;j<=digit;j++)
				fact=fact*j;
				sum=sum+fact;
			}
		if(sum==a)
		System.out.println(i+" ");
      }
 }
}