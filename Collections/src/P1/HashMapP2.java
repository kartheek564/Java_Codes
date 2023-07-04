package P1;
import java.util.*;
public class HashMapP2 {

	public static void main(String[] args) {
		HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
		hm.put(1, 'K');
		hm.put(2,'A' );
		hm.put(3,'R' );
		hm.put(4, 'T');
		hm.put(5, 'H');
		hm.put(6, 'E');
		hm.put(7, 'E');
		hm.put(8, 'K');
		System.out.println(hm);
		hm.put(9, 'M');
		System.out.println(hm);
	}
}
