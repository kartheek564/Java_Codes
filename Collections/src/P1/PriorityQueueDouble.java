package P1;
import java.util.*;
public class PriorityQueueDouble
{
	public static void main(String[] args)
	{
		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		pq.add(1.1);
		pq.add(3.6);
		pq.add(8.7);
		pq.add(2.4);
		pq.add(9.8);
		pq.add(11.1);
		pq.add(18.5);
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
	}

}
