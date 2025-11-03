import java.util.LinkedList;
import java.util.Scanner;

public class stockTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Stock> StockList = new LinkedList<Stock>();
		/*
		 * String name, int count, double price, String unitOfMeasure, 
		 * String manufacturer, String location, int ID
		 */
	    StockList.add(new Stock("Apple", 53, 3.47, "lbs","Monkey Orchard", "Produce Section #D14", 49913));
	    StockList.add(new Stock("Wrench", 7, 7.23, "lbs","Monkey Machanics", "Tools Section #F11", 34357));
	    StockList.add(new Stock("Shampoo", 12, 7.50, "oz","Monkey Salon", "Hygine Secion #T03", 56638));
	    StockList.add(new Stock("Tommy Gun", 387, 1238.32, "lbs","Monkey With A Machine Gun Co.", "Outdoors Secion #G01", 16942));

	    boolean quit = false;
	    
	    while(quit!=true)
	    {
	    
	    
	    System.out.println("Welcome to the stock tester please select from the options below (Input validation has not been "
	    		+ "implemented yet so be careful!)"+"\r\n1.List stock\r\n2.Add stock\r\n3.Remove stock\r\n4.Edit stock\r\n5.Exit");
	    Scanner keyboard = new Scanner(System.in);
	    int choice = keyboard.nextInt();
	    
	    if(choice == 1)
	    {
	    	
	    for(int i = 0; i<= StockList.size()-1; i++)
		{
			System.out.print((i+1)+" : "+StockList.get(i).toString()+"\r\n---------------------------------------------------------------------------------------------------------\r\n");
			
		}
	    
	    }
	    else if(choice == 2)
	    {
	    	//adding stock
	    	//user input
	    	System.out.println("Stock Name: ");
	    	String name = keyboard.next();
	    	System.out.println("Stock count: ");
	    	int count = keyboard.nextInt();
	    	System.out.println("Stock price: ");
	    	double price = keyboard.nextDouble();
	    	System.out.println("Stock unit of measure: ");
	    	String unit = keyboard.next();
	    	System.out.println("Stock manufacturer: ");
	    	String manufacturer = keyboard.next();
	    	System.out.println("Stock location: ");
	    	String location = keyboard.next();
	    	System.out.println("Stock ID: ");
	    	int id = keyboard.nextInt();
	    	
	    	//adding new stock
	    	StockList.add(new Stock(name,count,price,unit,manufacturer,location,id));
	    	
	    }
	    else if(choice == 3)
	    {
	    	System.out.println("which stock would you like to remove from the list below?");
	    	
	    	//listing stocks
		    for(int i = 0; i<= StockList.size()-1; i++)
			{
				System.out.print((i+1)+" : "+StockList.get(i).toString()+"\r\n---------------------------------------------------------------------------------------------------------\r\n");
				
			}
	    	//user input
	    	int del = keyboard.nextInt()-1;
	    	
	    	StockList.remove(del);
	    }
	    else if(choice == 4)
	    {
	    	System.out.println("not implemented yet!");
	    }
	    else if(choice == 5)
	    {
	    	quit = true;
	    }
	    else
	    {
	    	System.out.println("woop woop woop wwwwwooooooopppp");
	    }
	    
	    
	    
	    
	    }
		
	}

}
