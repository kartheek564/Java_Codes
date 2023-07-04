import java.util.*;
public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N value : ");
		int n = sc.nextInt();
		boolean status = false;
		for(int i=1;i<=n;i++)
		{
			if(i*i==n)
			{
				status=true;
				break;
			}
		}
		if(status)
		{
			System.out.println(n+" is a perfect square");

		}
		else
		{
			System.out.println(n+" is not a perfect square");
		}
	}
}
