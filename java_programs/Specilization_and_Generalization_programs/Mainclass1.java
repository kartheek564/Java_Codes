class Car
{
	public String brandName;
	public Car(String brandName)
	{
		this.brandName=brandName;
	}
	public void start()
	{
		System.out.println(brandName+" car is started for travell");
	}
	public void changeGear()
	{
		System.out.println("Shift Gear");
		System.out.println("============");
	}
}
class Mainclass1
{
	public static void travell(Car car)
	{
		car.start();
		car.changeGear();
	}
	public static void main(String[] args) 
	{
		travell(new Car("Audi"));
		travell(new Car("Benz"));
		travell(new Car("BMW"));
	}
}
