package agroceriesShop;

import java.util.Scanner;

public class Maine {

	static boolean exit1 = true;
	static boolean exit2 = true;
	static boolean exit3 = true;

	static int option2;
	static int option3;
	static int option4;

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
		System.out.println("8-Exit ");
	}

	static void shopSettingsMenu() {

		Scanner sc = new Scanner(System.in);
do {
		System.out.println("1- Load Data (Items and invoices)");
		System.out.println("2- Set Shop Name (data should be saved)");
		System.out.println("3- Set Invoice Header (Tel / Fax / Email / Website)");
		System.out.println("4- Go Back");
		System.out.println("0- Exit ");

		
		switch (option2) {

		case 1:

			System.out.println("Load Data : ");
			option2 = sc.nextInt();

			break;

		case 2:

			System.out.println("Set Shop Name : ");
			option2 = sc.nextInt();
			break;

		case 3:

			System.out.println("Set Invoice Header :");
			option2 = sc.nextInt();

			break;

		case 4:

			System.out.println("Set Invoice Header :");
			option2 = sc.nextInt();

			break;

		case 0:

			System.out.println(" Going Back .... ");
			option2 = sc.nextInt();

			
			

			break;

		}
		
		}while (exit2);
	}

	static void manageShopItems() {

		Scanner sc = new Scanner(System.in);
		System.out.println(" 1- Add Items (Item should be saved/serialized ");
		System.out.println(" 2- Delete Item ");
		System.out.println(" 3- Change Item Price ");
		System.out.println(" 4- Report All Items ");
		System.out.println(" 0- Go Back ");
		if (option2 == 1) {

			System.out.println("Your Password has been changed");
			option2 = sc.nextInt();

		} else if (option2 == 0) {

			System.out.println("GOOD BYE & SEE YOU SOON ");

			exit2 = false;
		}

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

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean exit1 = true;
		boolean exit2 = true;
		boolean exit3 = true;

		int option1;
		int option2;
		int option3;

		welcomeMassege();
		sc.nextLine();

		do {

			applicationMainMenu();
			option1 = sc.nextInt();

			switch (option1) {

			case 1:

				shopSettingsMenu();
				option2 = sc.nextInt();
				

				break;

			case 2:

				manageShopItems();
				option3 = sc.nextInt();

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
