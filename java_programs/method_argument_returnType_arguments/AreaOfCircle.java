class AreaOfCircle 
{
	public void findRadius(int diameter)
	{
		int radius = diameter/2;
		System.out.println("Given diameter is : "+diameter);
		System.out.println("Radius is : "+radius);
	}
	public static void main(String[] args) 
	{

		System.out.println("Main Starts..");
		AreaOfCircle ac= new AreaOfCircle();
		ac.findRadius(12);
		System.out.println("Main Ends..");
	}
}
