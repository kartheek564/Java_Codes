class Car 
{
	public void ChangeGear(int a)
	{
		System.out.println("Changed Gear to : "+a);
		move();
	}
	public static void move()
	{
		System.out.println("move starts...");
		System.out.println("move ends...");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");
		Car car = new Car();
		car.ChangeGear(3);
		System.out.println("Main Ends...");
	}
}
