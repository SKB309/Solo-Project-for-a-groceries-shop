package agroceriesShop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Maine {

	static String name;

	Shop shop;
	
	static void connectToDataBase() throws Throwable, IllegalAccessException, ClassNotFoundException {

		Connection connection;

		try {

			// Create a connection to the database

			String serverName = "localhost";

			String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
			String user = "sa";
			String pass = "root";
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			DriverManager.registerDriver(driver);

			connection = DriverManager.getConnection(url, user, pass);

			System.out.println("Successfully Connected to the database!" + " SoloProjectBatch1 ");

		} catch (SQLException e) {

			System.out.println("Could not connect to the database " + e.getMessage());
		}

	}

	 static void createItemsTable() throws Throwable{
		Connection conn;
		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		try (Connection conn1 = DriverManager.getConnection(url, user, pass);
				Statement stmt = conn1.createStatement();) {
			String sql = "CREATE TABLE GroceryItems "
				    + "( Id int PRIMARY KEY IDENTITY(1,1)," 
					+ " Item_Name VARCHAR(1000),"
					+ " Quantity INTEGER," 
					+ " Unit_Price float," 
					+ " Qty_Amount INTEGER ,)" ;
			
			
			stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	 static void createInvoiceTable() throws Throwable {
		Connection conn;
		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		try (Connection conn1 = DriverManager.getConnection(url, user, pass);
				Statement stmt = conn1.createStatement();) {
			String sql = "CREATE TABLE Invoice "
				    + "( Id int PRIMARY KEY IDENTITY(1,1)," 
					+ " Name VARCHAR(1000),"
					+ " Phone_Number INTEGER ," 
					+ " Invoice_Date VARCHAR(1000) ," 
					+ " Number_Of_Items INTEGER ,"
			        + " Total_Amount INTEGER,"
			        + " Paid_Amount INTEGER ," 
			        + " Balance INTEGER ," 
			        + " Total float,)";
							  
			stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void insertInItemsTable() {
		
		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter Item Name");
		String Item_Name = scanner.next();

		System.out.println("Enter Quantity");
		Integer Quantity = scanner.nextInt();

		System.out.println("Enter Unit Price");
		float Unit_Price = scanner.nextInt();

//		System.out.println("Enter Qty Amount");
//		float Qty_Amount = scanner.nextInt();

		

		String sql = "Insert into GroceryItems values( '" 
		        + Item_Name + "'," 
		        + Quantity + "," 
				+ Unit_Price + ","
				+ Quantity*Unit_Price + ")";

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

	static void insertInInvoiceTable() {
		
		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter Invoice Name");
		String Name = scanner.next();

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

		

		String sql = "Insert into Invoice values( '" 
		        + Name + "'," 
		        + Phone_Number + ",'" 
				+ Invoice_Date + "',"
				+ Number_Of_Items + ","
		        + Total_Amount + "," 
                + Paid_Amount + "," 
		        + Balance + ","
		        + Total + ")";

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
	
    static void applicationMainMenu() {

		System.out.println("* * * * * * *  Hello  * * * * * * * * * *");
		System.out.println("1-Shop Settings");
		System.out.println("2-Manage Shop Items");
		System.out.println("3-Create New Invoice (Invoices should be save/serialized)");
		System.out.println("4-Report: Statistics (No Of Items, No of Invoices, Total Sales)");
		System.out.println(
				"5-Report: All Invoices ( Invoice No, Invoice Date, Customer Name, No of items, Total, Balance)");
		System.out.println("6-Search (1) Invoice (Search by Invoice No and Report All Invoice details with items");
		System.out.println("7-Program Statistics (Print each Main Menu Item with how many number selected)");
		System.out.println("0-Exit ");
	}

	static void shopSettingsMenu() {

		Scanner sc = new Scanner(System.in);

		int option2;

		boolean exit2 = true;
		do {
			System.out.println("1- Load Data (Items and invoices)");
			System.out.println("2- Set Shop Name (data should be saved)");
			System.out.println("3- Set Invoice Header (Tel / Fax / Email / Website)");
			System.out.println("4- Go Back");
			System.out.println("0- Exit ");

			option2 = sc.nextInt();

			switch (option2) {

			case 1:
				loadData();
//				
				break;

			case 2:

//				System.out.println("Set Shop Name : ");
				setShopName();
				option2 = sc.nextInt();
				break;

			case 3:

				System.out.println("Set Invoice Header :");
				option2 = sc.nextInt();

				break;

			case 4:

				System.out.println(" Going Back :");
				option2 = sc.nextInt();

				break;

			case 0:

				exit2 = false;

				break;

			default:

				System.out.println("please choose correct Number");

			}

		} while (exit2);
	}

	static void manageShopItems() throws Throwable {

		Scanner sc = new Scanner(System.in);

		int option3;
		GroceryItem groceryItem;

		boolean exit3 = true;
		do {
			System.out.println("1- Add Items (Item should be saved/serialized");
			System.out.println("2- Delete Item");
			System.out.println("3- Change Item Price");
			System.out.println("4- Report All Items");
			System.out.println("0- Exit ");

			option3 = sc.nextInt();

			switch (option3) {

			case 1:

				System.out.println(" Add Items : ");
				enterItems();
				option3 = sc.nextInt();

				
				
			

				break;

			case 2:

				System.out.println(" Delete Item : ");
				option3 = sc.nextInt();
				break;

			case 3:

				System.out.println(" Change Item Price :");
				option3 = sc.nextInt();

				break;

			case 4:

				System.out.println(" Report All Items :");
				option3 = sc.nextInt();

				break;

			case 0:

				exit3 = false;

				break;

			default:

				System.out.println("please choose correct Number");

			}

		} while (exit3);
	}

	static void enterItems() {
		
		
    
    
		Scanner sc = new Scanner(System.in);

		Invoice invoice = new Invoice();

		while (true) {
			System.out.print("Enter item name (or 'done' to finish): ");
			String name = sc.nextLine();
			if (name.equalsIgnoreCase("done")) {
				break;
			}
			System.out.print("Enter item price: ");
			float price = (float) Double.parseDouble(sc.nextLine());

			System.out.print("Enter item quantity: ");
			Integer quantity = Integer.parseInt(sc.nextLine());

			invoice.addItem(new GroceryItem(name, price, quantity));
		}

		invoice.printInvoice();
		Stack<String> historyStack = new Stack<>();
		List<GroceryItem> groceryItemList = new ArrayList<>();


		System.out.println(" Serialization and Deserialization are done ");
		while (historyStack.empty() == false) {
			System.out.println(historyStack.pop());
		    int option3 = 0;

			
			GroceryItem groceryItem1 = new GroceryItem(name, option3, option3);
			
			groceryItem1.setItemName(name);
			groceryItemList.add(groceryItem1);
			historyStack.push(name);
			try {
				FileOutputStream fops1 = new FileOutputStream("saidkb.text");
				ObjectOutputStream out1 = new ObjectOutputStream(fops1);
				out1.writeObject(groceryItem1);
				out1.flush();
				out1.close();
				System.out.println("Done");
			} catch (Exception e) {
				System.out.print(e);
			}

	}}

	static void setShopName() {

		Shop sho = new Shop();

		sho.getShopName().add(name);
		sho.saveData();
	}

	static void loadData() {
		 
		insertInItemsTable();
		insertInInvoiceTable();
		
	}
	
	static void exitAction() {

		System.out.println("* * * * * * *  Exit  * * * * * * * * * *");
		System.out.println("* * * * * *  THANK YOU  * * * * * * * *");
		System.out.println("**********SEE YOU SOON *************");
//		" + userName + "

	}

	static void defaultAction() {

		System.out.println("please choose correct Number");
	}

	static void welcomeMassege() {

		System.out.println("WELCOME TO CODE LINE HYPER MARKIT SYSTEM ");
		System.out.println("Please Press Enter key to continue...");
	}

	public static void main(String[] args) throws Throwable {

		Scanner sc = new Scanner(System.in);

		boolean exit1 = true;	

		int option1;	

		welcomeMassege();
		sc.nextLine();
	
		

		do {

			applicationMainMenu();
			option1 = sc.nextInt();
			

			switch (option1) {

			case 1:

				shopSettingsMenu();

				break;

			case 2:


				break;

			case 3:
				connectToDataBase();

				break;

			case 4:
				createItemsTable();

				break;

			case 5:
				createInvoiceTable();

				break;

			case 6:

				break;

			case 7:

				break;

			case 8:

				break;

			case 0:
				
				exitAction();
				exit1 = false;
				break;

			default:

				defaultAction();

			}
		} while (exit1);

		;

	}
}
