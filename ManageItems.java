package agroceriesShop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManageItems {

	public static void manageShopItems(String url, String user, String pass) throws Throwable {

		Scanner sc = new Scanner(System.in);

		int option3;
		GroceryItem groceryItem;

		boolean exit3 = true;
		do {
			try {
				MainMenuClass.ShopItemsMenu(url, user, pass);
				option3 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("This Choice Contains Characters that are not accepted ");
				System.out.println("Please Choose Only Numbers ");

				sc.nextLine();
				continue;
			}

			switch (option3) {

			case 1:

				EditingData.addItemsIntoTable(url, user, pass);

				break;

			case 2:

				EditingData.deleteItemsFromTable(url, user, pass);

				break;

			case 3:

				EditingData.priceChange(url, user, pass);

				break;

			case 4:

				InsertTables.reportAllItems(url, user, pass);

				break;

			case 0:

				exit3 = false;

				break;

			default:

				System.out.println("please choose correct Number");

			}

		} while (exit3);
	}

}
