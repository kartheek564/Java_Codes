class Walk
{
	public static void run()
	{
		System.out.println("Running");
	}
	public void walk()
	{
		System.out.println("Jogging");
	}
}


class Day
{
	public static String day="Morning";
	public String day1="Night";
}


class MainClass1
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Walk.run();
		Walk walk = new Walk();
		walk.walk();
		System.out.println(Day.day);
		Day day = new Day();
		System.out.println(day.day1);
		System.out.println("Main Ends");
	}
}
