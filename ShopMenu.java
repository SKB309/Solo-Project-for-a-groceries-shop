package agroceriesShop;

import java.util.Scanner;

public class ShopMenu {
	
	public static void shopSettingsMenu() {

		Scanner sc = new Scanner(System.in);

		int option2;

		boolean exit2 = true;
		do {

			SettingsMenuClass.shopSettingMenu();

			option2 = sc.nextInt();

			switch (option2) {

			case 1:

				InsertInItems.insertItems();

				InsertInInvoice.InsertInInvoiceTables();

				break;

			case 2:

				ShopNameClass.nameOfTheShop();
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

}
