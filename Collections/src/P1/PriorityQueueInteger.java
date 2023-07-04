package P1;
import java.util.*;
public class PriorityQueueInteger
{
	public static void main(String[] args)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(30);
		pq.add(20);
		pq.add(10);
		pq.add(40);
		pq.add(50);
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
	}
}
