package P1;
import java.util.ArrayList;
public class RawTypeCollections
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("sai");
		al.add(0.5);
		al.add('c');
		System.out.println(al);
		//al.remove(3);
		al.set(1, "Kartheek");
		System.out.println(al);
		al.add(1, "Sakshi");
		System.out.println(al);
	}
}
