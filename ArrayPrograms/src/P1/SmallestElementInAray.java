package P1;

public class SmallestElementInAray {

	public static void main(String[] args) {
		int[] a = {1255,25,20,99,100,1};
		int smallest =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(smallest>a[i])
			{
				smallest = a[i];
			}
		}
		System.out.println(smallest);
	}
}