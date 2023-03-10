package agroceriesShop;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EditingData {

	public static void addItemsIntoTable(String url, String user, String pass) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter item name (or 'done' to finish): ");
			String Item_Name = sc.nextLine();
			if (Item_Name.equalsIgnoreCase("done")) {
				break;
			}

			System.out.print("Enter item quantity: ");
			Integer Quantity = Integer.parseInt(sc.nextLine());

			System.out.print("Enter item price: ");
			float Unit_Price = (float) Double.parseDouble(sc.nextLine());

			String sql = "Insert into GroceryItems values( '" + Item_Name + "'," + Quantity + "," + Unit_Price + ","
					+ Quantity * Unit_Price + ")";

			// Connection class object
			Connection con;

			// Try block to check for exceptions
			try {

				Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
				// Registering drivers
				DriverManager.registerDriver(driver);

				// Reference to connection interface
				con = DriverManager.getConnection(url, user, pass);

				// Creating a statement
				Statement st = con.createStatement();

				// Executing query
				int m = st.executeUpdate(sql);
				if (m >= 1)
					System.out.println("inserted successfully : " + sql);
				else
					System.out.println("insertion failed");

				// Closing the connections
				con.close();
			}

			// Catch block to handle exceptions
			catch (Exception ex) {
				// Display message when exceptions occurs
				System.err.println(ex);
			}
			System.out.println("!!!!!!!!!!!!!!Serialized Done Successfully!!!!!!!!!!!!!!");
			try (FileOutputStream fileOut = new FileOutputStream("item.ser");
					ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
				out.writeObject(Item_Name);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public static void priceChange(String url, String user, String pass) throws Throwable {

		Connection con;

		// Reference to connection interface
		con = DriverManager.getConnection(url, user, pass);

		// Creating a statement
		Statement st = con.createStatement();

		System.out.println(" Please Enter Item Name To Update Unit Price");
		Scanner inputScanner = new Scanner(System.in);
		String userInput = inputScanner.next();
		System.out.println(" Please Enter  Unit Price To Update ");
		float userInput2 = inputScanner.nextFloat();

		String sqlQueryToUpdate = "UPDATE GroceryItems SET Unit_Price =" + userInput2 + " WHERE Item_Name = '"
				+ userInput + "'";
		System.out.println(sqlQueryToUpdate);

		try {
			Statement statement = con.createStatement();
			int m = statement.executeUpdate(sqlQueryToUpdate);

		} catch (Exception ex) {
			System.err.println(ex);
		}

	}

	public static void deleteItemsFromTable(String url, String user, String pass) throws Throwable {

		Connection con;

		// Reference to connection interface
		con = DriverManager.getConnection(url, user, pass);

		// Creating a statement
		Statement st = con.createStatement();

		Scanner sc = new Scanner(System.in);

		System.out.println(" Please Enter The Item Name To Delete The Row");
		String userInput = sc.next();
		String sqlQueryToDelete = "DELETE FROM GroceryItems WHERE Item_Name = '" + userInput + "'";
		try {
			Statement statement = con.createStatement();
			int resultSet = statement.executeUpdate(sqlQueryToDelete);

			System.out.println("The Item Name " + userInput + " Has Been Deleted ");

		} catch (Exception ex) {
			System.err.println(ex);
		}

	}
	
	public static void invoiceSearch2(String url, String user, String pass) {

		
//		 Total Sales)
	String sql = "SELECT Id,Number_Of_Items,Total_Amount FROM Invoice";
	Connection con = null;
	try {
		Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

		DriverManager.registerDriver(driver);

		con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery(sql);

		while (result.next()) {

			Integer id = result.getInt("Id");
			Integer Number_Of_Items = (int) result.getFloat("Number_Of_Items");
			Integer Total_Amount = (int) result.getFloat("Total_Amount");
			
			
			

			System.out.println("Id :" + id + "||" + " " + " Number Of Items is:" + Number_Of_Items + "||" + " "
					+ "Item Total Amount :" + Total_Amount + "||" + " ");
		}
		con.close();
	} catch (Exception e) {
		System.err.println(e);
	}
} 
	
	public static void invoiceSearch(String url, String user, String pass) {
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter invoice number: ");
//		String invoiceNumber = sc.nextLine();
//
//		// Search for the invoice using the invoice number
//		// Assume that you have an array of invoices stored in a database
//		Invoice invoice = null;
//		GroceryItem croceryItem;
//		for (Invoice inv : customerName) {
//			if (inv.getInvoiceNumber().equals(invoiceNumber)) {
//				invoice = inv;
//				break;
//			}
//		}
//
//		// Report all the details of the invoice
//		if (invoice != null) {
//			System.out.println("Invoice Number: " + invoice.getInvoiceNumber());
//			System.out.println("Customer Name: " + invoice.getCustomerName());
//			System.out.println("Invoice Date: " + invoice.getInvoiceDate());
//			System.out.println("Invoice Total: " + invoice.getInvoiceDate());
//			System.out.println("Invoice Items:");
//			for (GroceryItem item : invoice.getGroceryItem()) {
//				System.out.println("  Item Name: " + item.getItemName());
//				System.out.println("  Item Quantity: " + item.getQuantity());
//				System.out.println("  Item Price: " + item.getUnitPrice());
//			}
//		} else {
//			System.out.println("Invoice not found.");
//		}
	}

}
