package P1;
public class ReverseEachCharInString
{
	public static void main(String[] args)
	{
		String s1 = "I got placed in a company";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) 
		{
				char ch = s1.charAt(i);
				s2=s2+ch;
		}
		String[] s3 = s2.split(" ");
		System.out.println(s3[5]+" "+s3[4]+" "+s3[3]+" "+s3[2]+" "+s3[1]+" "+s3[0]);
	}
}




/*another method ======== Sir said
 * 
 main()
 {
 String s1 = "I am working in a company";
 String[] sArray = s.split(" ");
 for(int i=0;i<=sArray.lenght-1;i++)
 {
 reverse(sArray[i]);
 }
 }
 public static void reverse(String s)
 {
 for(int i=s.lenght()-1;i>=0;i--)
 {
 char ch = s.charAt(i);
 System.out.println(ch);
 }
 System.out.println(" ");
 }
 */
