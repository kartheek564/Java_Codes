class Demo 
{
	public static int a = 10;
	public static void display()
	{
		System.out.println(a);
		System.out.println(Demo.a);
		Demo demo = new Demo();
		System.out.println(demo.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		display();
		System.out.println("Main ends");
	}
}
