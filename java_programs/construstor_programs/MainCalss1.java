class Car 
{
	public static String brand = "Tata";
	public String series;
	public int speed,time;
	public String source,destination;
	public Car(String series,int speed,int time,String source,String destination)
	{
		this.series = series;
		this.speed = speed;
		this.time = time;
		this.source = source;
		this.destination = destination;
	}
	public void calculateDistance() 
	{
		int distance = speed*time;
		//System.out.println(brand);
		System.out.println(brand+" "+series+" Car start from "+source+" in the speed of "+speed+"kmph to reach "+distance+"KM in the time of"+time+"HR'S to the "+destination);
	}
}
class MainCalss1
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Car c1 = new Car("Desire",100,2,"Hyderabad","Banglore");
		Car c2 = new Car("Desire A1",80,3,"Hyderabad","Chennai");
		c1.calculateDistance();
		c2.calculateDistance();
		System.out.println("Main Ends");
	}
}