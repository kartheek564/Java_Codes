package P1;
import java.util.*;
public class TreeSetInteger {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(2);
		ts.add(5);
		ts.add(4);
		ts.add(9);
		ts.add(44);
		for (Integer i1 : ts) {
			System.out.print(i1+" ");
		}
	}

}
