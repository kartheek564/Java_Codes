import java.util.Scanner;														//System.out.println("");
class Project																	//sc.next()
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to ZOMATO");
		System.out.println("===================================");
		System.out.println("Enter Details for registration");
		System.out.println("Enter the name : ");
		String name=sc.nextLine();
		System.out.println("Enter the Mobile number : ");
		long mobile=sc.nextLong();
		System.out.println("Enter the mail id : ");
		String Mail=sc.next();
		System.out.println("Enter the user name : ");
		String uname=sc.next();
		/*System.out.println("Confirm user name : ");
		String nuname=sc.next();*/
		System.out.println("Enter the Password : ");
		String pwd=sc.next();
		System.out.println("Confirm Password : ");
		String npwd=sc.next();
		if(pwd.equals(npwd)/*&&(uname.equals(nuname)*/)
		{
			System.out.println("---------------------");
			System.out.println("Press 1 for SUBMIT or \npress 2 for CANCEL...!!");
			int a=sc.nextInt();
			if(a==1)
				{
				System.out.println("Registration Successfully..!!");
				System.out.println("============================");
				System.out.println("Press 1 for LOGIN or \npress 2 for EXIT...!!");
				int b=sc.nextInt();
				if(b==1)
					{
					System.out.println("Enter the user name : ");
					String unamee=sc.next();
					System.out.println("Enter the Password : ");
					String pwdd=sc.next();
					if(pwdd.equals(pwd)&&(unamee.equals(uname)))
					{
					System.out.println("Login Successfully..!!");
					}
					else
					{
					System.out.println("Invaild User name and Password");
					}
					while (true)
					{
					System.out.println("============================");
					System.out.println("Order your food");
					System.out.println("Please select below");
					System.out.println("1. Veg");
					System.out.println("2.Non-Veg");
					System.out.println("3.BreakFast");
					System.out.println("4.Starters");
					int v=sc.nextInt();
					if(v==1)
						{
						System.out.println("==============================");
						System.out.println("Please select below veg items");
						System.out.println("1.Veg Biryani");
						System.out.println("2.Veg Manchuriya");
						System.out.println("3.Veg Noodles");
						System.out.println("4.Veg Fried Rice");
						//System.out.println("EXIT");
						System.out.println("============================");
						int veg=sc.nextInt();
						if(veg==1)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1  Veg Biryani is Selected");break;
							case 2: System.out.println("2 Veg Biryani's is Selected");break;
							case 3: System.out.println("3 Veg Biryani's is Selected");break;
							case 4: System.out.println("4 Veg Biryani's is Selected");break;
							case 5: System.out.println("5 Veg Biryani's is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Veg Biryani is Ready order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
							{
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
									
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else if(m==4)
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
							else{
								System.out.println("Invalid Payment Method");
							}
							}
					}
						}
						else if(veg==2)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 Veg Manchuriya is Selected");break;
							case 2: System.out.println("2 Veg Manchuriya's is Selected");break;
							case 3: System.out.println("3 Veg Manchuriya's is Selected");break;
							case 4: System.out.println("4 Veg Manchuriya's is Selected");break;
							case 5: System.out.println("5 Veg Manchuriya's is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Veg Manchuriya is Ready order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else if(m==4)
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
								else{
								System.out.println("Invalid Payment Method");
							}
							}
						}
						else if(veg==3)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 Veg Noodles is Selected");break;
							case 2: System.out.println("2 Veg Noodles is Selected");break;
							case 3: System.out.println("3 Veg Noodles is Selected");break;
							case 4: System.out.println("4 Veg Noodles is Selected");break;
							case 5: System.out.println("5 Veg Noodles is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Veg Noodles is  ready to order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else if(m==4)
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
							else
								System.out.println("Invalid Payment Method");
						}
						}
						else if(veg==4)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 Veg Fried Rice is Selected");break;
							case 2: System.out.println("2 Veg Fried Rice is Selected");break;
							case 3: System.out.println("3 Veg Fried Rice is Selected");break;
							case 4: System.out.println("4 Veg Fried Rice is Selected");break;
							case 5: System.out.println("5 Veg Fried Rice is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Veg Fried Rice is ready to order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
							}
						}
						else
						{
							System.out.println("Try again");
							
						}
					}
				else if(v==2) 
						{
						System.out.println("==============================");
						System.out.println("Please select below Non-veg items");
						System.out.println("1.Chicken Biryani");
						System.out.println("2.Chicken Manchuriya");
						System.out.println("3.Chicken Noodles");
						System.out.println("4.Chicken Fried Rice");
						System.out.println("EXIT");
						System.out.println("============================");
						int veg1=sc.nextInt();
						if(veg1==1)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 Chicken Biryani is Selected");break;
							case 2: System.out.println("2 Chicken Biryani's is Selected");break;
							case 3: System.out.println("3 Chicken Biryani's is Selected");break;
							case 4: System.out.println("4 Chicken Biryani's is Selected");break;
							case 5: System.out.println("5 Chicken Biryani's is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Chicken Biryani is Ready to order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
							}
						}
						else if(veg1==2)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 Chicken Manchuriya is Selected");break;
							case 2: System.out.println("2 Chicken Manchuriya's is Selected");break;
							case 3: System.out.println("3 Chicken Manchuriya's is Selected");break;
							case 4: System.out.println("4 Chicken Manchuriya's is Selected");break;
							case 5: System.out.println("5 Chicken Manchuriya's is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Chicken Manchuraya is Ready to order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else if(m==4)
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Invalid Payment Method");
							}
						
						}
				else if(veg1==3)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 Chicken Noodles is Selected");break;
							case 2: System.out.println("2 Chicken Noodles's is Selected");break;
							case 3: System.out.println("3 Chicken Noodles's is Selected");break;
							case 4: System.out.println("4 Chicken Noodles's is Selected");break;
							case 5: System.out.println("5 Chicken Noodles's is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Chicken Noodles is ready to order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else if(m==4)
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Invalid Payment Method");
							}
						}
						else if(veg1==4)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 Chicken Fried Rice is Selected");break;
							case 2: System.out.println("2 Chicken Fried Rice is Selected");break;
							case 3: System.out.println("3 Chicken Fried Rice is Selected");break;
							case 4: System.out.println("4 Chicken Fried Rice is Selected");break;
							case 5: System.out.println("5 Chicken Fried Rice is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Chicken Fried Rice is ready to order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else if(m==4)
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Invalid Payment Method");
							}
						}
						else
						{
						System.out.println("Invalid item");
						}
						}
					else if (v==3)
						{
						System.out.println("==============================");
						System.out.println("Please select below veg items");
						System.out.println("1.Idly");
						System.out.println("2.Poori");
						System.out.println("3.Bonda");
						System.out.println("4.Dosa");
						//System.out.println("EXIT");
						System.out.println("============================");
						int bf=sc.nextInt();
						if(bf==1)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 plate of Idly is Selected");break;
							case 2: System.out.println("2 plates of Idly is Selected");break;
							case 3: System.out.println("3 plates of Idly is Selected");break;
							case 4: System.out.println("4 plates of Idly is Selected");break;
							case 5: System.out.println("5 plates of Idly is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Idlyi is Ready to order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else if(m==4)
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Invalid Payment Method");
							}
						}
						else if(bf==2)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 plate of Poori is Selected");break;
							case 2: System.out.println("2 plates of Poori is Selected");break;
							case 3: System.out.println("3 plates of Poori is Selected");break;
							case 4: System.out.println("4 plates of Poori is Selected");break;
							case 5: System.out.println("5 plates of Poori is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Poori is ready to order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else if(m==4)
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Invalid Payment Method");
							}
						}
						else if(bf==3)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 plate of Bonda is Selected");break;
							case 2: System.out.println("2 plates of Bonda is Selected");break;
							case 3: System.out.println("3 plates of Bonda is Selected");break;
							case 4: System.out.println("4 plates of Bonda is Selected");break;
							case 5: System.out.println("5 plates of Bonda is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Bonda is ready to order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else if(m==4)
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Invalid Payment Method");
							}
						}
						else if(bf==4)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 plate of Dosa is Selected");break;
							case 2: System.out.println("2 plates of Dosa is Selected");break;
							case 3: System.out.println("3 plates of Dosa is Selected");break;
							case 4: System.out.println("4 plates of Dosa is Selected");break;
							case 5: System.out.println("5 plates of Dosa is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Dosa is ready to order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else if(m==4)
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Invalid Payment Method");
							}
						}
						else
						{
						System.out.println("Invalid item");
						}

						}
				else if(v==4)
						{
					System.out.println("==============================");
						System.out.println("Please select below veg items");
						System.out.println("1.Chicken 65");
						System.out.println("2.French Fries");
						System.out.println("3.Chilli chicken");
						System.out.println("4.Parota");
						//System.out.println("EXIT");
						System.out.println("============================");
						int st=sc.nextInt();
						if(st==1)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 plate of Chicken 65 is Selected");break;
							case 2: System.out.println("2 plates of Chicken 65 is Selected");break;
							case 3: System.out.println("3 plates of Chicken 65 is Selected");break;
							case 4: System.out.println("4 plates of Chicken 65 is Selected");break;
							case 5: System.out.println("5 plates of Chicken 65 is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Chicken 65 is ready to order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else if(m==4)
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Invalid Payment Method");
							}
						}
						else if(st==2)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 plate of French Fries is Selected");break;
							case 2: System.out.println("2 plates of French Fries is Selected");break;
							case 3: System.out.println("3 plates of French Fries is Selected");break;
							case 4: System.out.println("4 plates of French Fries is Selected");break;
							case 5: System.out.println("5 plates of French Fries is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("French Fries is ready to order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else if(m==4)
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Invalid Payment Method");
							}
						}
						else if(st==3)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 plate of Chilli checken is Selected");break;
							case 2: System.out.println("2 plates of Chilli checken is Selected");break;
							case 3: System.out.println("3 plates of Chilli checken is Selected");break;
							case 4: System.out.println("4 plates of Chilli checken is Selected");break;
							case 5: System.out.println("5 plates of Chilli checken is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Chilli checken is ready to order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else if(m==4)
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Invalid Payment Method");
							}
						}
						else if(st==4)
						{
						System.out.println("No of Quantities");
						int q=sc.nextInt();
						switch(q)
							{
							case 1: System.out.println("1 plate of Parota is Selected");break;
							case 2: System.out.println("2 plates of Parota is Selected");break;
							case 3: System.out.println("3 plates of Parota is Selected");break;
							case 4: System.out.println("4 plates of Parota is Selected");break;
							case 5: System.out.println("5 plates of Parota is Selected");break;
							//default : System.out.println("Invalid selection");break;
							}
							if(q>5)
							{
							System.out.println("Invalid selection");
							}
							else
							{
						System.out.println("Parota is ready to order");
						System.out.println("==============================");
						System.out.println("Confirm your order Through");
						System.out.println("1.GooglePay");
						System.out.println("2.Phonepay");
						System.out.println("3.Paytm");
						System.out.println("4.Cash on Delivery");
						int m=sc.nextInt();
						if(m==1)
								{
								System.out.println("Payment through GooglePay");
								System.out.println("Enter UPI ID");
								int upi=sc.nextInt();
								if(upi==123456)
								{
									System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Incorrect upi please Try again");
								}
						else if(m==2)
								{
								System.out.println("Payment through PhonePay");
								System.out.println("Enter UPI ID");
								int upi1=sc.nextInt();
								if(upi1==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
						else if(m==3)
								{
								System.out.println("Payment through Paytm");
								System.out.println("Enter UPI ID");
								int upi2=sc.nextInt();
								if(upi2==123456)
								{
								System.out.println("Order Placed \nHave a good day");
								}
								else
								System.out.println("Incorrect upi please Try again");
								}
							else if(m==4)
								{
								System.out.println("Ordered through Cash on delivery");
								System.out.println("===============");
								System.out.println("Order Placed \nHave a good day");
								}
								else
									System.out.println("Invalid Payment Method");
							}
						}
						else
						{
						System.out.println("Invalid item");
						}
						}
					else
					System.out.println("Invalid Selection");
			}
					}
					
			else if(a==2)
			{
				System.out.println("Registration creation is Cancelled....!!");
			}
			else
				System.out.println(" 404--Error..!!");
			}
			else
			 System.out.println("Incorrect Password : ");
				}
	}
}
		