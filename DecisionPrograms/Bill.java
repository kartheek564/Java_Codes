class Bill 
{
	public static void main(String[] args) 
	{
		int b=251;
		if(b>=0)
		{
			if(b>=0&&b<50)
			{
			System.out.println("The bill is "+(b*2)+" Rupees");
			}
			else if(b>=51&&b<150)
			{
				System.out.println("The bill is "+(b*3)+" Rupees");
			}
			else if(b>=151&&b<250)
			{
				System.out.println("The bill is "+(b*5)+" Rupees");
			}
			else 
			{
				System.out.println("The bill is "+(b*8)+" Rupees");
			}
		}
		else
		{
		System.out.println("Invalid Units");
		}
	}
	
	}

