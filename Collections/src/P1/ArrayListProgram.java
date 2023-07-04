package P1;
import java.util.ArrayList;
import java.util.*;
public class ArrayListProgram
{
	public static void main(String[] args)
	{
		System.out.println("Enter the elements to an array : ");
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(sc.hasNextInt())
		{
			
				al.add(sc.nextInt());
		}
		System.out.println(al);
	}
}
