package agroceriesShop;

import java.util.Scanner;

public class Maine {

	static void applicationMainMenu() {

		System.out.println("1-Shop Settings");
		System.out.println("2-Manage Shop Items");
		System.out.println("3-Create New Invoice (Invoices should be save/serialized)");
		System.out.println("4-Report: Statistics (No Of Items, No of Invoices, Total Sales)");
		System.out.println(
				"5-Report: All Invoices ( Invoice No, Invoice Date, Customer Name, No of items, Total, Balance)");
		System.out.println("6-Search (1) Invoice (Search by Invoice No and Report All Invoice details with items");
		System.out.println("7-Program Statistics (Print each Main Menu Item with how many number selected)");
		System.out.println("8-Exit ");

	}

	static void shopSettingsMenu() {

		System.out.println("1- Load Data (Items and invoices)");
		System.out.println("2- Set Shop Name (data should be saved)");
		System.out.println("3- Set Invoice Header (Tel / Fax / Email / Website)");
		System.out.println("4- Go Back");
		System.out.println("0- Exit ");

	}

	static void manageShopItems() {

		System.out.println(" 1- Add Items (Item should be saved/serialized ");
		System.out.println(" 2- Delete Item ");
		System.out.println(" 3- Change Item Price ");
		System.out.println(" 4- Report All Items ");
		System.out.println(" 5- Go Back ");

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

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);

		boolean exit1 = true;
		int option;

		do {

			shopSettingsMenu();
			option = sa.nextInt();

			switch (option) {

			case 1:

				break;

			case 2:

				break;

			case 3:

				break;

			case 4:

				break;

			case 0:

				exitAction();
				exit1 = false;

			default:

				defaultAction();

			}
		} while (exit1);

	}
}
