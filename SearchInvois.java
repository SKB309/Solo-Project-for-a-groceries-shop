package agroceriesShop;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInvois {
	
	public static void invoiceSearch() {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter invoice number: ");
	    String invoiceNumber = sc.nextLine();

	    // Search for the invoice using the invoice number
	    // Assume that you have an array of invoices stored in a database
	    Invoice invoice = null;
	    GroceryItem croceryItem;
	    for (Invoice inv : invoices) {
	      if (inv.getInvoiceNumber().equals(invoiceNumber)) {
	        invoice = inv;
	        break;
	      }
	    }

	    // Report all the details of the invoice
	    if (invoice != null) {
	      System.out.println("Invoice Number: " + invoice.getInvoiceNumber());
	      System.out.println("Customer Name: " + invoice.getCustomerName());
	      System.out.println("Invoice Date: " + invoice.getInvoiceDate());
	      System.out.println("Invoice Total: " + invoice.getInvoiceDate());
	      System.out.println("Invoice Items:");
	      for (GroceryItem item : invoice.getGroceryItem()) {
	        System.out.println("  Item Name: " + item.getItemName());
	        System.out.println("  Item Quantity: " + item.getQuantity());
	        System.out.println("  Item Price: " + item.getUnitPrice());
	      }
	    } else {
	      System.out.println("Invoice not found.");
	    }
	  }
	


}
