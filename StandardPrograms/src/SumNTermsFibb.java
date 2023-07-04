import java.util.*;
public class SumNTermsFibb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int sum=0;
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.println(n1+" "+n2);
		for(int i=3;i<=n;i++)
		{
			n3=n1+n2;
			System.out.println(" "+n3);
			sum=sum+n3;
			n1=n2;
			n2=n3;
		}
		System.out.println("sum of "+n+" fibbinoccii numbers is : "+sum);
	}

}
