interface Animal
{
	void noise();
}
class Dog implements Animal
{
	public void noise()
	{
		System.out.println("Dog barks");
	}
}
class Cat implements Animal 
{
	public void noise()
	{
		System.out.println("Cat Meows");
	}
}
class Lion implements Animal
{
	public void noise()
	{
		System.out.println("Lion Roars");
	}
}
class MainCalss1 
{
	public static void animalNoise(Animal a1)
	{
		a1.noise();
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		animalNoise(new Dog());
		animalNoise(new Cat());
		animalNoise(new Lion());
		System.out.println("Main ends");
	}
}
