package P1;
import java.util.*;
public class Hashmapprogram 
{
public static void main(String[] args)
{
	HashMap<Integer, String> hs = new HashMap<Integer, String>();
	hs.put(04, "Sai");
	hs.put(01, "sai");
	hs.put(02,"Kartheek");
	hs.put(03, "Sakshi");
	hs.put(06, "sai");
	System.out.println(hs);
	System.out.println(hs.get(02));
	System.out.println(hs.keySet());
	System.out.println(hs.values());
	System.out.println(hs.size());
	System.out.println(hs.remove(06));
	System.out.println(hs);
	hs.put(04, "Ruthvik");
	System.out.println(hs);
	
}
}
