package P1;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDouble {

	public static void main(String[] args) {
	ArrayList<Double> d1 = new ArrayList<Double>();
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	d1.add(10.5);
	d1.add(5.6);
	d1.add(7.4);
	d1.add(1.8);
	d1.add(9.78);
	d1.add(5, 5.5);
    System.out.println(d1);
	//d1.remove(new Double(5.6));//to remove
	//System.out.println(d1);
	//System.out.println(d1.get(1));//to retrive
	//d1.set(3, 11.11);
	//System.out.println(d1);//to add on specific position
	//System.out.println(a1.isEmpty());//Returns true if this list contains no elements
	//System.out.println(d1.size());//size of array list
	//System.out.println(d1.contains(new Double(9.7)));//element present in an arrayElement or not
	Iterator itr=d1.iterator();  
	while(itr.hasNext())
	{  
	System.out.println(itr.next());  
	}  
	}
}