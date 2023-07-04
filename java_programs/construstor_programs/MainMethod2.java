class  Book
{
	public String title;
	public int price;
	Book(String title,int price)
	{
		this.title = title;
		this.price = price;
	}
	public void sell()
	{
		System.out.println(title+" Book sells at a price as "+ price);
	}
}
class MainMethod2
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Book b1 = new Book("Baghavath Geetha",300);
		Book b2 = new Book("Quaran",300);
		Book b3 = new Book("Bible",300);
		b1.sell();
		b2.sell();
		b3.sell();
		System.out.println("Main Ends");
	}
}