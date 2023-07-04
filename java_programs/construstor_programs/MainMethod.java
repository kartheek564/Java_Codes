class  Gun
{
	public int bullets;
	 Gun(int bullets)
	{
		this.bullets = bullets ;
	}
	public void shoot()
	{
		System.out.println("Shoot "+bullets+" bullets");
	}
	
}
class MainMethod 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Gun g1= new Gun(2);
		Gun g2= new Gun(4);
		Gun g3= new Gun(16);
		g1.shoot();
		g2.shoot();
		g3.shoot();
		System.out.println("Main Ends");
	}
}