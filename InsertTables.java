package agroceriesShop;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTables {

	public static void InsertInInvoiceTables(String url, String user, String pass) {

	

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Customer Name");
		String Customer_Name = scanner.next();

		System.out.println("Enter Phone Number");
		Integer Phone_Number = scanner.nextInt();

		System.out.println("Enter Invoice Date");
		String Invoice_Date = scanner.next();

		System.out.println("Enter Number Of Items");
		Integer Number_Of_Items = scanner.nextInt();

		System.out.println("Enter Total Amount");
		Integer Total_Amount = scanner.nextInt();

		System.out.println("Enter Paid Amount");
		Integer Paid_Amount = scanner.nextInt();

		System.out.println("Enter Balance");
		Integer Balance = scanner.nextInt();

		System.out.println("Enter Total");
		Integer Total = scanner.nextInt();

		String sql = "Insert into Invoice values( '" + Customer_Name + "'," + Phone_Number + ",'" + Invoice_Date + "',"
				+ Number_Of_Items + "," + Total_Amount + "," + Paid_Amount + "," + Balance + "," + Total + ")";

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
		try (FileOutputStream fileOut = new FileOutputStream("CustomerName.ser");
		         ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
		      out.writeObject(Customer_Name);
		     
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
	}


	public static void insertItems(String url, String user, String pass) {


		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Item Name");
		String Item_Name = scanner.next();

		System.out.println("Enter Quantity");
		Integer Quantity = scanner.nextInt();

		System.out.println("Enter Unit Price");
		float Unit_Price = scanner.nextFloat();

//		System.out.println("Enter Qty Amount");
//		float Qty_Amount = scanner.nextInt();

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

	}

	
	public static void nameOfTheShop(String url , String user, String pass) {


		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Shop Name");
		String Name_Of_Shop = scanner.next();

		String sql = "Insert into Shop_Name values( '" + Name_Of_Shop + "')";

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

	}

	public static void insertInvoiceHeader(String url , String user, String pass) {
	}

	public static void reportAllItems(String url , String user, String pass) throws Throwable {

			
			String sql = "SELECT * FROM GroceryItems";
			Connection con = null;
			try {
				Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

				DriverManager.registerDriver(driver);

				con = DriverManager.getConnection(url, user, pass);
				Statement st = con.createStatement();
				ResultSet result = st.executeQuery(sql);

				while (result.next()) {

					Integer id = result.getInt("Id");
					String itemName = result.getString("Item_Name");
					Float unitPrice = result.getFloat("Unit_Price");
					Float qtyAmount = result.getFloat("Qty_Amount");
					Integer quantity = result.getInt("Quantity");
//					Integer Shop_id = result.getInt("Shop_id");
					
					

					System.out.println("Id :" + id + "||" + " " + "Item Name is:" + itemName + "||" + " "
							+ "Item Unit Price :" + unitPrice + "||" + " " + "Item Quantity Price :"
							+ qtyAmount + "||" + " " + "Item Quantity :" + quantity + "||" + " "
//							+ "From Shop Id "
							);
				}
				con.close();
			} catch (Exception e) {
				System.err.println(e);
			}
		} // End of reportAllItems Function	
		
		
		
		
	
}

