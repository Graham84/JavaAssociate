/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CustomerTest {
   
  public static void main (String[] args){
	  
      Customer c1 = new Customer(),
               c2 = new Customer();
      
      
      c1.setCustomerInfo(1, "Harry", "234 Maple St", "505-123-4545");
      c2.setCustomerInfo(2, "Sally", "567 Oak St", "505-123-2323", "sally@gmail.com");
      
      //calling methods
      c1.display();
      c2.display();
      
      //accessing fields
      System.out.println(c1.name);
      System.out.println(c2.address);
      System.out.println(c1.eMail);
      System.out.println(c2.eMail);
  } 
}
