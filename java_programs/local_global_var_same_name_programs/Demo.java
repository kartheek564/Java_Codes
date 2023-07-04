class Demo 
{
	public static int a =10;
	public static void display()
	{
		int a = 30;
		System.out.println(a);
		System.out.println(Demo.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		new Demo().display();
		System.out.println("Main ends");
	}
}
