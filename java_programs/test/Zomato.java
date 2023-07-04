class Zomato
{
String food; 
String coldDrink; 
String snaks;
Zomato (String food, String coldDrink)
	{
this. food = food; 
this.coldDrink = coldDrink;
	}
Zomato(String food, String coldDrink, String snaks)
	{
this(food, coldDrink);
	}
public static void main(String [] args)
	{
Zomato zomato = new Zomato("Idli", "Maza"); 
Zomato zomato1 = new Zomato("Dosa", "Coca-Cola","chips"); 
System.out.println("order: "+ zomato. food+" "+zomato1.snaks);
	}
}