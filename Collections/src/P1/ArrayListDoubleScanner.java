package P1;
import java.util.*;
public class ArrayListDoubleScanner {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements to an array : ");
		ArrayList<Double> al = new ArrayList<Double>();
		while(sc.hasNextDouble())
		{
			al.add(sc.nextDouble());
		}
		System.out.println(al);
	}
}
