class Hotel 
{
	public static void serveFood()
	{
		System.out.println("ServeFood starts...");
		Hotel hotel = new Hotel();
		hotel.eatFood();
		System.out.println("ServeFood Ends...");
	}
	public void eatFood()
	{
		System.out.println("eatFood starts...");
		System.out.println("eatFood Ends...");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");
		serveFood();
		System.out.println("Main Ends...");
	}
}
