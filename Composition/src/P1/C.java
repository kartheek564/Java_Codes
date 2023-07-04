package P1;

public class C {
	public static int a =10;
	public static String b="Java";
	public static D d = new D();
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		//C.d.write();
		d.write();
	}
}