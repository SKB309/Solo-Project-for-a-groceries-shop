package agroceriesShop;

import java.util.Scanner;

public class Maine {

	public static void main(String[] args) throws Throwable {

		Scanner sc = new Scanner(System.in);
		boolean exit1 = true;
		DataBaseConnection dbconnection=new DataBaseConnection();
        System.out.println("please Enter the database url");
        dbconnection.setUrl(sc.next());
        System.out.println("please Enter the username");
        dbconnection.setUser(sc.next());
        System.out.println("please Enter the password");
        dbconnection.setPass(sc.next());
		WelcomeClass.welcomeMassege();
		MainMenuClass.connectToDataBase();
//		WelcomeClass.checkLogin(username, password);

		do {

			int option1;

			MainMenuClass.masterMenu(dbconnection.getUrl(),dbconnection.getUser(),dbconnection.getPass());
			option1 = sc.nextInt();
			switch (option1) {

			case 1:
				MainMenuClass.shopSettingsMenu(dbconnection.getUrl(),dbconnection.getUser(),dbconnection.getPass());
				break;

			case 2:
				ManageItems.manageShopItems(dbconnection.getUrl(),dbconnection.getUser(),dbconnection.getPass());
				break;

			case 3:
				InsertTables.InsertInInvoiceTables(dbconnection.getUrl(),dbconnection.getUser(),dbconnection.getPass());

				break;

			case 4:
				EditingData.invoiceSearch(dbconnection.getUrl(),dbconnection.getUser(),dbconnection.getPass());

				break;

			case 5:

				break;

			case 6:

				break;

			case 7:

				break;

			case 8:
				MainMenuClass.createTables(dbconnection.getUrl(),dbconnection.getUser(),dbconnection.pass);
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