package agroceriesShop;

import java.util.Scanner;

public class Maine {

	static void shopSettingsMenu() {

		System.out.println("1- Load Data (Items and invoices)");
		System.out.println("2- Set Shop Name (data should be saved)");
		System.out.println("3- Set Invoice Header (Tel / Fax / Email / Website)");
		System.out.println("4- Go Back");
		System.out.println("0- Exit ");

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
