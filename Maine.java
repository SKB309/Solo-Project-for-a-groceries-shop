package agroceriesShop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Stack;

public class Maine {

	static void connectToDataBase() throws Throwable {

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
	
	static void createItemsTable() throws Throwable {
		Connection conn;
		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		try (Connection conn1 = DriverManager.getConnection(url, user, pass);
				Statement stmt = conn1.createStatement();) {
			String sql = "CREATE TABLE GroceryItems " + "( Id int PRIMARY KEY IDENTITY(1,1),"
					+ " Item_Name VARCHAR(1000)," + " Quantity INTEGER," + " Unit_Price float,"
					+ " Qty_Amount INTEGER ,)";

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
			String sql = "CREATE TABLE Invoice " + "( Id int PRIMARY KEY IDENTITY(1,1)," + " Name VARCHAR(1000),"
					+ " Phone_Number INTEGER ," + " Invoice_Date VARCHAR(1000) ," + " Number_Of_Items INTEGER ,"
					+ " Total_Amount INTEGER," + " Paid_Amount INTEGER ," + " Balance INTEGER ," + " Total float,)";

			stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	static void createShopNameTable() {

		Connection conn;
		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		try (Connection conn1 = DriverManager.getConnection(url, user, pass);
				Statement stmt = conn1.createStatement();) {
			String sql = "CREATE TABLE Shop_Name " + "( Id int PRIMARY KEY IDENTITY(1,1),"
					+ " Name_Of_Shop VARCHAR(1000),)";

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

		String sql = "Insert into Invoice values( '" + Name + "'," + Phone_Number + ",'" + Invoice_Date + "',"
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

	}

	static void setShopName() {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

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
		System.out.println("8-Create Tables");
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

				setShopName();
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

				addItems();

				break;

			case 2:

				deleteItem();

				break;

			case 3:

				changeItemPrice();

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
    
	static void createTables() throws Throwable {
		Scanner sc = new Scanner(System.in);
		int option4;
		boolean exit4 = true;
		do {

			System.out.println(" 1- Create Items Table  ");
			System.out.println(" 2- Create Invoice Table ");
			System.out.println(" 3- Create Shop Name Table ");
			System.out.println(" 0- Exit ");

			option4 = sc.nextInt();

			switch (option4) {

			case 1:

				createItemsTable();

				break;

			case 2:

				createInvoiceTable();

				break;

			case 3:

				createShopNameTable();

				break;

			case 0:

				exit4 = false;
				break;

			default:

				defaultAction();

			}
		} while (exit4);

	}
	
	static void addItems() {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

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

		}

	}

	static void deleteItem() throws Throwable {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";
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

	static void changeItemPrice() throws Throwable {
		
		
//		TO BE Complete

		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";
		Connection con;

		// Reference to connection interface
		con = DriverManager.getConnection(url, user, pass);

		// Creating a statement
		Statement st = con.createStatement();

		System.out.println(" Please Enter Item Name To Update Unit Price");
		Scanner inputScanner = new Scanner(System.in);
		float userInput = inputScanner.nextInt();

		String sqlQueryToUpdate = "UPDATE GroceryItems SET Unit_Price =('" + userInput + "')";
		System.out.println(sqlQueryToUpdate);
		try {
			Statement statement = con.createStatement();
			int m = statement.executeUpdate(sqlQueryToUpdate);

		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
			
	static void loadData() {
		 
		insertInItemsTable();
		insertInInvoiceTable();
		
	}
	
	static void exitAction() {

		Scanner sc = new Scanner(System.in);
		
		
		boolean isExitSystem = true;
		String yes = null;

		System.out.println("Are you sure you want to exit? yes, program ends,if No , main menu reprinted again");
		String exitSystem = sc.next();
		if (exitSystem == yes) {
			isExitSystem = false;

		}
	
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

	static void userNameAndPass()throws Throwable {
		
		boolean isUser = true;

		Scanner sc = new Scanner(System.in);
		Stack<String> historyStack = new Stack<>();

		while (isUser) {
			System.out.println("Entere user name");
			String userName = sc.next();
			historyStack.push(userName);

			try {
				if (!userName.equals("SAID")) {
					throw new Exception("user name is wrong");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}

			System.out.println("Entere user Password");
			String userPass = sc.next();
			historyStack.push(userPass);

			try {
				if (!userPass.equals("said")) {
					throw new Exception("user Password is wrong");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		isUser = false;
	}

	public static void main(String[] args) throws Throwable {

		Scanner sc = new Scanner(System.in);

		boolean exit1 = true;

		int option1;

		welcomeMassege();
		sc.nextLine();
		connectToDataBase();
//		userNameAndPass();
		

		do {

			applicationMainMenu();
			option1 = sc.nextInt();

			switch (option1) {

			case 1:

				shopSettingsMenu();

				break;

			case 2:

				manageShopItems();

				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			case 6:

				break;

			case 7:

				break;

			case 8:
				createTables();
				break;

			case 0:

				exitAction();
				exit1 = false;
				break;

			default:

				defaultAction();

			}
		} while (exit1);

	}

}

