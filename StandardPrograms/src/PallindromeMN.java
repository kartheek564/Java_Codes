import java.util.*;
public class PallindromeMN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m value :");
		int m = sc.nextInt();
		System.out.print("Enter n value :");
		int n = sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			int rev=0;
			int a=i;
			while(a!=0)
			{
				int digit = a%10;
				rev = rev*10+digit;
				a=a/10;
			}
			if(rev==i)
			{
				System.out.println(i+" ");
			}
		}
	}
}
