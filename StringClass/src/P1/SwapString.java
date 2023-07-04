package P1;

public class SwapString
{
	public static void main(String[] args)
	{
		String s = "I got job in Company";
		String[] s1 = s.split(" ");
		
			String fW=s1[0];
			String lW=s1[4];
			 fW=s1[4];
			 lW=s1[0];
			System.out.println(fW+" "+ s1[3]+" "+s1[2]+" "+s1[1]+" "+lW );
	}
}