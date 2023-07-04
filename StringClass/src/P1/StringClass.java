package P1;

public class StringClass {

	public static void main(String[] args) {
		String s = new String("haii"); 
		String s2 = new String("Hello"); 
		String s3 = new String("Hai"); 
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		/*System.out.println(s.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s.equals(s3));
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());*/
		System.out.println(s.split(s3));	
	}
}