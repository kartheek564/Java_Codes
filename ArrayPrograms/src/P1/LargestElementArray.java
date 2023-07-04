package P1;

public class LargestElementArray 
{
	public static void main(String[] args)
	{
		int[] a = {1255,25,20,99,100,1100};
		int largest =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(largest<a[i])
			{
				largest = a[i];
			}
		}
		System.out.println(largest);
	}
}