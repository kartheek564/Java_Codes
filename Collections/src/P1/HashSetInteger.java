package P1;
import java.util.*;
public class HashSetInteger {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();//hashset does not having tracing it follows hashcode 
		hs.add(18);
		hs.add(52);
		hs.add(23);
		hs.add(4);
		hs.add(10);
		hs.add(6);
		System.out.println(hs);
	}

}
