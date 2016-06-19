/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Customer {

    public int customerID = 0; // Default ID for the customer
    public char status = 'N'; // default
    public double totalPurchases = 0.0; // default
    public String name = "-name required-";
    public String email = "-email required-";

// This method displays the values for an item
    public void displayCustomerInfo() {

    	System.out.println("***** Customer Info *****");
        System.out.println("Customer ID: " + customerID);
        System.out.println("Status: " + status);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Purchases: " + totalPurchases);
        System.out.println("*************************");
    } // end of display method
}
