package com.restraurant;

import java.util.*;

public class Restaurant 
{
	static Scanner sc=new Scanner(System.in);
	static double total=0;
	
	public static void menu()
	{
		System.out.println("Welcome to the FoodCosta...");
		System.out.println("FoodCosta Menu:");
		System.out.println("1.Veg Maggi- 80 INR \n2.Cheese Maggi- 90 INR \n3.French Fries- 70 INR \n4.Cold Coffee- 100 INR \n5.Exit");
	}
	public static void order()
	{
		System.out.println("1.Veg Maggi- 80 INR \n2.Cheese Maggi- 90 INR \n3.French Fries- 70 INR \n4.Cold Coffee- 100 INR \n5.Exit");
		System.out.println("Enter Number for order.");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				System.out.println("Your choice Veg Maggi !");
				System.out.println("How many veg maggi you want...");
				int qty=sc.nextInt();
				total=total+(qty*80);
				System.out.println("Anything else you want: \nPress Y for [YES] or N for [NO]"); ;
				String again=sc.next();
				if(again.equalsIgnoreCase("Y"))
				{
					order();
				}
				else
				{
					System.out.println("Your bill is -");
					System.out.println(total);
					System.out.println("Enter Payment:");
					int pay=sc.nextInt();
					if(pay<total)
					{
						System.out.println("Please enter correct amount");
						System.out.println("Your bill is -");
						System.out.println(total);
						System.out.println("Enter Payment:");
						int pay1=sc.nextInt();
						System.out.println("total="+ total);
						total=pay1-total;
						System.out.println("Customer's return "+ total);
						System.out.println("Thank you ! your order will receive you shortly.");
						System.out.println("Please have a seat !");
						
					}
					else
					{
						System.out.println("total="+ total);
						total=pay-total;
						System.out.println("Customer's return "+ total);
						System.out.println("Thank you ! your order will receive you shortly.");
						System.out.println("Please have a seat !");
					}
				}
				
			}
			break;
			case 2:
			{
				System.out.println("Your choice Cheese Maggi !");
				System.out.println("How many Cheese maggi you want...");
				int qty=sc.nextInt();
				total=total+(qty*90);
				System.out.println("Anything else you want: \nPress Y for [YES] or N for [NO]"); ;
				String again=sc.next();
				if(again.equalsIgnoreCase("Y"))
				{
					order();
				}
				else
				{
					System.out.println("Your bill is -");
					System.out.println(total);
					System.out.println("Enter Payment:");
					int pay=sc.nextInt();
					if(pay<total)
					{
						System.out.println("Please enter correct amount");
						System.out.println("Your bill is -");
						System.out.println(total);
						System.out.println("Enter Payment:");
						int pay1=sc.nextInt();
						System.out.println("total="+ total);
						total=pay1-total;
						System.out.println("Customer's return "+ total);
						System.out.println("Thank you ! your order will receive you shortly.");
						System.out.println("Please have a seat !");
						
					}
					else
					{
						System.out.println("total="+ total);
						total=pay-total;
						System.out.println("Customer's return "+ total);
						System.out.println("Thank you ! your order will receive you shortly.");
						System.out.println("Please have a seat !");
					}
				}
				
			}
			break;
			case 3:
			{
				System.out.println("Your choice French fries !");
				System.out.println("How many plates you want...");
				int qty=sc.nextInt();
				total=total+(qty*70);
				System.out.println("Anything else you want: \nPress Y for [YES] or N for [NO]"); ;
				String again=sc.next();
				if(again.equalsIgnoreCase("Y"))
				{
					order();
				}
				else
				{
					System.out.println("Your bill is -");
					System.out.println(total);
					System.out.println("Enter Payment:");
					int pay=sc.nextInt();
					if(pay<total)
					{
						System.out.println("Please enter correct amount");
						System.out.println("Your bill is -");
						System.out.println(total);
						System.out.println("Enter Payment:");
						int pay1=sc.nextInt();
						System.out.println("total="+ total);
						total=pay1-total;
						System.out.println("Customer's return "+ total);
						System.out.println("Thank you ! your order will receive you shortly.");
						System.out.println("Please have a seat !");
						
					}
					else
					{
						System.out.println("total="+ total);
						total=pay-total;
						System.out.println("Customer's return "+ total);
						System.out.println("Thank you ! your order will receive you shortly.");
						System.out.println("Please have a seat !");
					}
				}
				
			}
			break;
			case 4:
			{

				System.out.println("Your choice Cold Coffee !");
				System.out.println("How many Cold Coffee you want...");
				int qty=sc.nextInt();
				total=total+(qty*100);
				System.out.println("Anything else you want: \nPress Y for [YES] or N for [NO]"); ;
				String again=sc.next();
				if(again.equalsIgnoreCase("Y"))
				{
					order();
				}
				else
				{
					System.out.println("Your bill is -");
					System.out.println(total);
					System.out.println("Enter Payment:");
					int pay=sc.nextInt();
					if(pay<total)
					{
						System.out.println("Please enter correct amount");
						System.out.println("Your bill is -");
						System.out.println(total);
						System.out.println("Enter Payment:");
						int pay1=sc.nextInt();
						System.out.println("total="+ total);
						total=pay1-total;
						System.out.println("Customer's return "+ total);
						System.out.println("Thank you ! your order will receive you shortly.");
						System.out.println("Please have a seat !");
						
					}
					else
					{
						System.out.println("total="+ total);
						total=pay-total;
						System.out.println("Customer's return "+ total);
						System.out.println("Thank you ! your order will receive you shortly.");
						System.out.println("Please have a seat !");
					}
				}
				
			}
			break;
			case 5:
			{
				System.out.println("Please visit Again!");
				System.exit(0);
				
			}
			default:
			{
				System.out.println("Please Enter Correct Amount !");
			}
		}
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		//menu();
		order();

	}

}
