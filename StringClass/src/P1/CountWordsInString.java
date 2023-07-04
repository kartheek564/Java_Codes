package P1;

public class CountWordsInString {

	public static void main(String[] args) {
		String s = "How are you";
		int count=0;
		int count1=0;
		String[] s1=s.split(" ");
		for(int i=0;i<s.length();i++)
		{
		if(s.length()>0)
		{
			count++;
		}
		}
		System.out.println("Count of characters in a string : "+count);
		System.out.println("Count of Words in  a String : "+s1.length);
	}
}