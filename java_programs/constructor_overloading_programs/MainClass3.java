class Box 
{
	public double length;
	public double width;
	public double height;
	public Box(double length,double width)
	{
		this.length= length;
		this.width = width;
	}
	public Box(double length,double width,double height)
	{
		this.length= length;
		this.width = width;
		this.height = height;
	}
	public void twoD()
	{
		System.out.println("========3D=========");
		System.out.println("Length :"+length+"\n width : "+width);
	}
	public void threeD()
	{
		System.out.println("=========2D========");
		System.out.println("Length :"+length+"\n width : "+width);
	}
	public void display()
	{
	if (height!=0)
	{
		threeD();
	}
	else
		twoD();
	}
}

class MainClass3 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Box b1 = new Box(15,50,100);
		b1.display();
		Box b2 = new Box(64,540);
		b2.display();
		System.out.println("Main Ends");

	}
}
