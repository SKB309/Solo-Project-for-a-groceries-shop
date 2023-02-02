package agroceriesShop;

import java.util.Scanner;

public class ManageItems {
	
	public static void manageShopItems() throws Throwable {

		Scanner sc = new Scanner(System.in);

		int option3;
		GroceryItem groceryItem;

		boolean exit3 = true;
		do {

			MainMenuClass.ShopItemsMenu();
			option3 = sc.nextInt();

			switch (option3) {

			case 1:

				EditingData.addItemsIntoTable();

				break;

			case 2:

				EditingData.deleteItemsFromTable();

				break;

			case 3:

				EditingData.priceChange();

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

}
