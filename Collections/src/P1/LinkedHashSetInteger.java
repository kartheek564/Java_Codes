package P1;
import java.util.*;
import java.util.Collections;
public class LinkedHashSetInteger {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		lhs.add(5);
		lhs.add(6);
		lhs.add(7);
		System.out.println(lhs);
		lhs.remove(2);
		System.out.println(lhs);
		System.out.println(lhs.contains(15));
		System.out.println(lhs.size());
		System.out.println(lhs);
		
	}

}
