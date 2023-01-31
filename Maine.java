package agroceriesShop;

import java.util.Scanner;

public class Maine {

	public static void main(String[] args) throws Throwable {

		Scanner sc = new Scanner(System.in);
		boolean exit1 = true;
		int option1;

		WelcomeClass.welcomeMassege();
		Connections.connectToDataBase();
//		UserNameClass.userLogin();
		do {
			MainMenuClass.masterMenu();
			option1 = sc.nextInt();
			switch (option1) {

			case 1:
				ShopMenu.shopSettingsMenu();
				break;

			case 2:
				ManageItems.manageShopItems();
				break;

			case 3:
				InsertInInvoice.InsertInInvoiceTables();

				break;

			case 4:
				SearchInvois.invoiceSearch();

				break;

			case 5:

				break;

			case 6:

				break;

			case 7:

				break;

			case 8:
				CreateingTables.createTables();
				break;

			case 0:
				ExitClass.toExit();
				exit1 = false;
				break;

			default:
				DefaultClass.defaultAction();
			}
		} while (exit1);
	}
}