abstract class Vehicle
	{
public abstract void fuel();
	}
class Car extends Vehicle
	{ 
		public void fuel()
			{
System.out.println("Diesel");
			}
	}
class Bike extends Vehicle 
{
	public void fuel()
	{
System.out.println("Petrol");
	}
}
class Program
	{
public void vehicleType(Vehicle vehicle)
		{
vehicle. fuel();
	}
public static void main(String [] args) 
	{
Program p = new Program();
p.vehicleType(new Car());
p.vehicleType(new Bike());
	}
	}