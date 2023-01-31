package agroceriesShop;

import java.util.Scanner;

public class ManageItems {
	
	public static void manageShopItems() throws Throwable {

		Scanner sc = new Scanner(System.in);

		int option3;
		GroceryItem groceryItem;

		boolean exit3 = true;
		do {

			ManageShopItemsClass.ShopItemsMenu();
			option3 = sc.nextInt();

			switch (option3) {

			case 1:

				AddItemsInTable.addItemsIntoTable();

				break;

			case 2:

				DeleteItemClass.deleteItemsFromTable();

				break;

			case 3:

				ChangeThePriceClass.priceChange();

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
