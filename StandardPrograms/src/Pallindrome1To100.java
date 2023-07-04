
public class Pallindrome1To100 {
	public static void main(String[] args) {
		int m=1;
		int n=100;
		int i;
		for( i=m;i<=n;i++)
		{
			int rev=0;
			int a=i;
				while(a!=0)
				{
					int digit = a%10;
					rev = rev * 10 + digit ;
					a=a/10;
				}
				if(i==rev)
				{
					System.out.println(i);
				}
		}
	}
}
