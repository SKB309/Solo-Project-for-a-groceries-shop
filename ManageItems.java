package agroceriesShop;

import java.util.Scanner;

public class ManageItems {
	
	public static void manageShopItems(String url, String user, String pass) throws Throwable {

		Scanner sc = new Scanner(System.in);

		int option3;
		GroceryItem groceryItem;

		boolean exit3 = true;
		do {

			MainMenuClass.ShopItemsMenu();
			option3 = sc.nextInt();

			switch (option3) {

			case 1:

				EditingData.addItemsIntoTable(url,user, pass);

				break;

			case 2:

				EditingData.deleteItemsFromTable(url,user, pass);

				break;

			case 3:

				EditingData.priceChange(url,user, pass);

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
