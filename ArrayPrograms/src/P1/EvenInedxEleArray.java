package P1;

public class EvenInedxEleArray 
{
	public static void main(String[] args)
	{
		int[] a = {2,1,4,15,17,6,20,25,60};
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"-->"+a[i]);
			}
		}
	}
}
