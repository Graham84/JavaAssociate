package shoppingCart;
public class ShoppingCart
{
	public static void main(String [] args) {
		
		//instantiate 2 item objects
		Item item1, item2;
		item1 = new Item();
		item2 = new Item();
		
		//assign values to fields
		item1.desc = "Shirt";
		item1.itemID = 123456;
		item2.desc = "Pants";
		item2.itemID = 654321;
		
		//display items
		System.out.println("Item 1: " + item1.desc + " " + item1.itemID);
		System.out.println("Item 2: " + item2.desc + " " + item2.itemID);
		
		//assign one item to another and run it again
		item2 = item1;
		System.out.println("Item 1: " + item1.desc + " " + item1.itemID);
		System.out.println("Item 2: " + item2.desc + " " + item2.itemID);
		
		item2 = item1;
		System.out.println("Item 1: " + item1.desc + " " + item1.itemID);
		System.out.println("Item 2: " + item2.desc + " " + item2.itemID);
		
		String custName = "Mary Smith";
		String itemDesc = "Shirt";
		String message /* = custName + " wants to purchase a " + itemDesc*/;
		
		int quantity = 3;
		double price = 29.99;
		double tax = 1.10;
		double total;
		
		message = custName + " wants to purchase " + quantity + " " + itemDesc + "s at €" + price;;
		System.out.println(message);
	
		total = quantity * price * tax;
		
		System.out.println(custName + "s total is €" + total);
	} 
}