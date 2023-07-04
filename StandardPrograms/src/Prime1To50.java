
public class Prime1To50 {

	public static void main(String[] args) {
		int i;
		int j;
		int m=50;
		for( i=1;i<=m;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}	
			}
			if(i==j)
			{
				System.out.println(i);
			}
		}
	}
}