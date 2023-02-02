package agroceriesShop;

import java.util.Scanner;

public class Maine {

	
	
	public static void main(String[] args) throws Throwable {

		Scanner sc = new Scanner(System.in);
		boolean exit1 = true;
		int option1;

		WelcomeClass.welcomeMassege();
		MainMenuClass.connectToDataBase();
//		MainMenuClass.userLogin();
		do {
			MainMenuClass.masterMenu();
			option1 = sc.nextInt();
			switch (option1) {

			case 1:
				MainMenuClass.shopSettingsMenu();
				break;

			case 2:
				ManageItems.manageShopItems();
				break;

			case 3:
				InsertTables.InsertInInvoiceTables();

				break;

			case 4:
				EditingData.invoiceSearch();

				break;

			case 5:

				break;

			case 6:

				break;

			case 7:

				break;

			case 8:
				MainMenuClass.createTables();
				break;

			case 0:
				MainMenuClass.toExit();
				exit1 = false;
				break;

			default:
				MainMenuClass.defaultAction();
			}
		} while (exit1);
	}
}