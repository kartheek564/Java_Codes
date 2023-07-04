class Circle 
{
	public int radius;
	public static double pi= 3.14;
	public Circle(int a)
	{
		radius=a;
	}
	public void findArea()
	{
		double area =pi*radius*radius; 
		System.out.println("Area of circle is : "+area);
	}
}
class MainCalss
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Circle c1 = new Circle(7);
		Circle c2 = new Circle(10);
		Circle c3 = new Circle(50);
		c1.findArea();
		c2.findArea();
		c3.findArea();
		System.out.println("Main Ends");
	}
}