class VolleyBall
{
	public static String name ="Raj";
	public String jersyColur = "Blue";
}
class Match
{
	public static void play()
	{
		System.out.println("Playing Starts");
		System.out.println(VolleyBall.name);
		VolleyBall volleyBall = new VolleyBall();
		System.out.println(volleyBall.jersyColur);
	}
	public void stop()
	{
		play();
		System.out.println("Stop the match");
	}
}
class  MainClass
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts ..");
		Match match =  new Match();
		match.stop();
		System.out.println("Main Ends ..");
	}
}
