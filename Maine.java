package agroceriesShop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Maine {

	static String name;

	Shop shop;

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

				System.out.println("Load Data : ");
				option2 = sc.nextInt();

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

				System.out.println(" Exit ");
				option2 = sc.nextInt();
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

				System.out.println(" Exit ");
				option3 = sc.nextInt();
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
			double price = Double.parseDouble(sc.nextLine());

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
//		boolean exit2 = true;
//		boolean exit3 = true;

		int option1;
//		int option2;
//		int option3;

		welcomeMassege();
		sc.nextLine();

		do {

			applicationMainMenu();
			option1 = sc.nextInt();

			switch (option1) {

			case 1:

				shopSettingsMenu();
//				option2 = sc.nextInt();

				break;

			case 2:

				manageShopItems();
//				option3 = sc.nextInt();

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

				break;

			case 0:
//				System.exit(0);
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
