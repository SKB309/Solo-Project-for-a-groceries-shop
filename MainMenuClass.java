package agroceriesShop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuClass {

	
	static String yes;
	
	public static void connectToDataBase() throws Throwable {

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

	
	public static void masterMenu(String url ,String user, String pass) {

		System.out.println("* * * * * * *  Hello  * * * * * * * * * *");
		System.out.println("1-Shop Settings");
		System.out.println("2-Manage Shop Items");
		System.out.println("3-Create New Invoice ");
		System.out.println("4-Report: Statistics (No Of Items, No of Invoices, Total Sales)");
		System.out.println("5-Report: All Invoices ( Invoice No, Invoice Date, Customer Name, No of items, Total, Balance)");
		System.out.println("6-Search (1) Invoice (Search by Invoice No and Report All Invoice details with items");
		System.out.println("7-Program Statistics (Print each Main Menu Item with how many number selected)");
		System.out.println("8-Create Tables");
		System.out.println("0-Exit ");
		
		

	}
	
	
	public static void shopSettingMenu(String url ,String user, String pass) {
		System.out.println("1- Load Data (Items and invoices)");
		System.out.println("2- Set Shop Name ");
		System.out.println("3- Set Invoice Header (Tel / Fax / Email / Website)");
		System.out.println("4- Go Back");
		System.out.println("0- Exit ");

	}
	
	
	public static void createTables(String url ,String user, String pass) throws Throwable {

		Scanner sc = new Scanner(System.in);
		int option4;
		boolean exit4 = true;
		do {
			
			try {
			System.out.println(" 1- Create Items Table  ");
			System.out.println(" 2- Create Invoice Table ");
			System.out.println(" 3- Create Shop Name Table ");
			System.out.println(" 4- Create Invoice Header Table");
			System.out.println(" 5- Create New Invoice Tables ");
			System.out.println(" 0- Exit ");

			option4 = sc.nextInt();
							
			} catch (InputMismatchException e) {
				System.out.println("This Choice Contains Characters that are not accepted ");
				System.out.println("Please Choose Only Numbers ");

				sc.nextLine();
				continue;
			}

			switch (option4) {

			case 1:

				CreateingTables.itemTable(url, user,pass);

				break;

			case 2:

				CreateingTables.invoiceTable(url, user,pass);

				break;

			case 3:

				CreateingTables.shopTable(url, user,pass);

				break;
				
			case 4 :
				
				CreateingTables.InvoiceHeader(url, user,pass);
				
				break;
				
			case 5 :
				
				CreateingTables.newInvoiceTable2(url, user, pass);
				
				break;

			case 0:

				exit4 = false;
				break;

			default:

				MainMenuClass.defaultAction();

			}
		} while (exit4);

	}
	
	
	public static void ShopItemsMenu(String url ,String user, String pass) {
		System.out.println("1- Add Items (Item should be saved/serialized");
		System.out.println("2- Delete Item");
		System.out.println("3- Change Item Price");
		System.out.println("4- Report All Items");
		System.out.println("0- Exit ");
	}
	
	
    public static void shopSettingsMenu(String url, String user, String pass) {

		Scanner sc = new Scanner(System.in);

		int option2;

		boolean exit2 = true;
		
		DataBaseConnection dbconnection = new DataBaseConnection();

		
		do {
			
			
			try {
				
			shopSettingMenu(dbconnection.getUrl(), dbconnection.getUser(), dbconnection.getPass());

			option2 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("This Choice Contains Characters that are not accepted ");
				System.out.println("Please Choose Only Numbers ");

				sc.nextLine();
				continue;
			}

			switch (option2) {

			case 1:

				InsertTables.insertItems(url,user, pass);

				InsertTables.InsertInInvoiceTables(url,user, pass);

				break;

			case 2:

				InsertTables.nameOfTheShop(url,user, pass);
				break;

			case 3:

				InsertTables.insertInvoiceHeader(url, user, pass);

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

    
    public static void toExit() {

		Scanner sc = new Scanner(System.in);

		boolean isExitSystem = true;

		System.out.println("Are you sure you want to exit? yes, program ends,if No , main menu reprinted again");
		String exitSystem = sc.next();
		if (exitSystem == yes) {
			isExitSystem = false;

		}

		System.out.println("* * * * * * *  Exit  * * * * * * * * * *");
		System.out.println("* * * * * *  THANK YOU  * * * * * * * *");
		System.out.println("**********SEE YOU SOON *************");
//	" + userName + "

	}

   
    public static void defaultAction() {

		System.out.println("please choose correct Number");
	}

    
    }



