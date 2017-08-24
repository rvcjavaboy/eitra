/**
 * @author Ranjit Chavan
 * @Date Jul 6, 2017
 * @File Name DispenserMachine.java
 */


class cashRegister
{
	/*
	 * CashRegister pojo Class
	 */

	
    private int cashOnHand; 
    public cashRegister(){
    	
    	cashOnHand=500;
    	
    }
    
	cashRegister(int cashIn){
		
		cashOnHand = cashIn;
		
		} 
	
	int getCurrentBalance(){
		
		return cashOnHand;
	}
	void acceptAmount(int amountIn){
		
		cashOnHand = cashOnHand + amountIn;

	}  
                                    
}
/*
 * DispenserMachine Type PojoClass
 * 
 */
class dispenserType {
   private int numberOfItems; 
	private int cost; 
    dispenserType(){
    	
    	numberOfItems = 50;
    	cost = 50;

    } 
	dispenserType(int setNoOfItems, int setCost){
		
		numberOfItems = setNoOfItems;
		cost = setCost;

	} 
	int getNoOfItems(){

		return numberOfItems;

		
	}	
	int getCost(){
		
		return cost;

	}	
	void makeSale(){
		
		numberOfItems--;

	} 

}

/*
 * 
 * DispenserMachine Operation
 * 
 * 
 * 
 */
public class DispenserMachine {
	
	java.util.Scanner scObj=new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		java.util.Scanner scObj=new java.util.Scanner(System.in);
		cashRegister counter=new cashRegister();
		dispenserType candyObj= new dispenserType(100, 50);
		dispenserType chipsObj=new dispenserType(100, 65);
		dispenserType gumObj=new dispenserType(75, 45);
		dispenserType cookieObj=new dispenserType(50, 85);
		int choice;
		showSelection();
		 choice=scObj.nextInt();
		while (choice != 5)
		{
			switch (choice)
			{
				case 1:
					sellProduct(candyObj, counter);
					break;
				case 2:
					sellProduct(chipsObj, counter);
					break;
				case 3:
					sellProduct(gumObj, counter);
					break;
				case 4:
					sellProduct(cookieObj, counter);
					break;
				default:
					System.out.println("Invalid Choice.");
			}
			showSelection();
			 choice=scObj.nextInt();
		}	

		
		
		
		
	}
	
	
	/*
	 * sellProduct This Method for the selling the product to dispencry machine
	 * 
	 * 
	 */
	
	private static void sellProduct(dispenserType product, cashRegister pCounter)
	{
		int amount; 
		int amount2; 
		if (product.getNoOfItems() > 0) 
		{
			System.out.println("Please deposit "+product.getCost()+" rupee");
			amount=new java.util.Scanner(System.in).nextInt();
			if (amount < product.getCost())
			{
			System.out.println("Please deposit another Account"+( product.getCost()-amount )+" rupee" );
				 amount2=new java.util.Scanner(System.in).nextInt();;
				amount = amount + amount2;
			}
			
			if (amount >= product.getCost())
			{
				pCounter.acceptAmount(amount);
				product.makeSale();
				System.out.println("Get Your Item \n");
			}

			else
				System.out.println("Not enough Amount \n"); 
		}
		else
			System.out.println("Item IS Sold" );
	}
	
	/*
	 * 
	 * Show the Item which Sold by Machine
	 * 
	 * 
	 */
	private static void showSelection()
	{
		
		System.out.println( "**************Dispenser Machine*****************" );
		System.out.println("1candy" );
		System.out.println( "2  chips" );
		System.out.println( "3   gum" );
		System.out.println("4  cookies" );
		System.out.println( "5 exit" );
	}

}
