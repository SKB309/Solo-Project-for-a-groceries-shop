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
		
		Connections connect = new Connections();
		Connections.connectToDataBase();

	}	
	static void createItemsTable() throws Throwable {
		
		
		CreateItemTable connectTable =new CreateItemTable();
		CreateItemTable.itemTable();
	}

	static void createInvoiceTable() throws Throwable {
		
		CreateInvoiceTable createInvoiceTable = new CreateInvoiceTable();
		CreateInvoiceTable.invoiceTable();
	}

	static void createShopNameTable() {

		CreateShopNameTable createShopNameTable = new CreateShopNameTable();
		CreateShopNameTable.shopTable();
	}

	static void insertInItemsTable() {

		InsertInItems insertInItems = new InsertInItems();
		InsertInItems.insertItems();

	}
	
	static void insertInInvoiceTable() {

		InsertInInvoice insertInInvoice = new InsertInInvoice();
		InsertInInvoice.InsertInInvoiceTables();

	}

	static void setShopName() {

		ShopNameClass shopNameClass = new ShopNameClass();
		ShopNameClass.nameOfTheShop();

	}

	static void applicationMainMenu() {

		MainMenuClass mainMenuClass = new MainMenuClass();
		MainMenuClass.masterMenu();
		
	}	
	static void shopSettingsMenu() {

		Scanner sc = new Scanner(System.in);
		
		int option2;

		boolean exit2 = true;
		do {
			
			SettingsMenuClass.shopSettingMenu();

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
			
			ManageShopItemsClass.ShopItemsMenu();
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
		
		AddItemsInTable.addItemsIntoTable();

	}
	static void deleteItem() throws Throwable {

		DeleteItemClass.deleteItemsFromTable();
	}

	static void changeItemPrice() throws Throwable {
		
		
//		TO BE Complete

		ChangeThePriceClass.priceChange();
	}
			
	static void loadData() {
		 
		insertInItemsTable();
		insertInInvoiceTable();
		
	}
	
	static void exitAction() {

		ExitClass.toExit();

	}
	static void defaultAction() {

		System.out.println("please choose correct Number");
	}

	static void welcomeMassege() {

		System.out.println("WELCOME TO CODE LINE HYPER MARKIT SYSTEM ");
		System.out.println("Please Press Enter key to continue...");
	}

	static void userNameAndPass()throws Throwable {
		
		UserNameClass.userLogin();
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

