class Circle1 
{
	public static double findRadius(double diameter)
	{
		double radius = diameter/2;
		return radius;
	}
	public static void printArea(double radius)
	{
		double area = 3.14*radius*radius;
		System.out.println("Area of circle is "+area);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts..");
		double result = findRadius(12.9);
		printArea(result);
		System.out.println("Main Ends..");
	}
}


