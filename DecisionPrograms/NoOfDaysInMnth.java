class NoOfDaysInMnth 
{
	public static void main(String[] args) 
	{
		int m=9;
		switch(m)
		{
			case 12:
			case 1:
			case 2:System.out.println("It is Winter");break;
			case 3:
			case 4:
			case 5:System.out.println("It is Summer");break;
			case 6:
			case 7:
			case 8:
			case 9:System.out.println("It is rainy");break;
			case 10:
			case 11:System.out.println("It is Spring");break;
			default: System.out.println("Inavlid month muber");
		}
	}
}
