import java.util.*;
public class NFibbinocciNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :  ");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.println(n1+" \n"+n2+" ");
		for(int i=3;i<=n;i++)
		{
			n3=n1+n2;
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
}
