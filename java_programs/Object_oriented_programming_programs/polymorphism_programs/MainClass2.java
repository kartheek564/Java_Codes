abstract class Shape
{
	abstract public void printArea();
}
class Circle extends Shape
{
	public final static double pi=3.14;
	public int r;
	public Circle(int r)
	{
		this.r=r;
	}
	public void printArea()
	{
		System.out.println("Area of circle is :"+pi*(r*r));
	}
}
class Rect extends Shape
{
	public int l;
	public int w;
	public Rect(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	public void printArea()
	{
		System.out.println("Area of Rectangel is :"+(l*w));
	}
}
class Tri extends Shape
{
	public int b;
	public int h;
	public Tri(int b,int h)
	{
		this.b=b;
		this.h=h;
	}
	public void printArea()
	{
		System.out.println("Area of Triangle is :"+(0.5)*(b*h));
	}
}
class MainClass2 
{
	public static void getArea(Shape shape)
	{
		shape.printArea();
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		getArea(new Circle(5));
		getArea(new Rect(10,60));
		getArea(new Tri(5,5));
		System.out.println("Main ends");
	}
}
