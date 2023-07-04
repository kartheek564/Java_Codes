class Calender
{
	private int monthNum;
	public void getName(int monthNum)
	{
		if (monthNum>=1 && monthNum<=12)
		{
			this.monthNum=monthNum;
		}	
		else
		{
			System.err.println("Please enter valid month");
		}
	}
	public void printMonthName()
	{
		switch (monthNum)
		{
		case 1:System.out.println("jan");break;
		case 2:System.out.println("feb");break;
		case 3:System.out.println("mar");break;
		case 4:System.out.println("apr");break;
		case 5:System.out.println("may");break;
		case 6:System.out.println("jun");break;
		case 7:System.out.println("jul");break;
		case 8:System.out.println("aug");break;
		case 9:System.out.println("sep");break;
		case 10:System.out.println("oct");break;
		case 11:System.out.println("nov");break;
		case 12:System.out.println("dec");break;
		}
	}
}
class MainClass
{
	public static void main(String[] args) 
	{
		Calender c1 = new Calender();
		c1.getName(12);
		c1.printMonthName();
	}
}
