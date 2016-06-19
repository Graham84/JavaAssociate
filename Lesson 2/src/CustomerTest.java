public class CustomerTest {
   
  public static void main (String args[]) {
	  Customer cust1/*, cust2*/;
 
	  cust1 = new Customer();
	  Customer cust2 = new Customer();
	  
	  //Assign values to member fields
	  cust1.customerID = 1;
	  cust1.status = 'Y';
	  cust1.name = "Mary Smith";
	  cust1.email = "mary.smith@gmail.com";
	  cust1.totalPurchases = 19.99;
	  
	  cust2.customerID = 2;
	  cust2.status = 'Y';
	  cust2.name = "John Smith";
	  cust2.email = "john.smith@gmail.com";
	  cust2.totalPurchases = 39.99;
	  
  //display info for each object
	  cust2 = cust1;
  cust1.displayCustomerInfo();
  cust2.displayCustomerInfo(); 

  } 
}
