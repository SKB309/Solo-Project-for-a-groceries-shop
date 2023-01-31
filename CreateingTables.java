package agroceriesShop;

import java.util.Scanner;

public class CreateingTables {
	
	public static void createTables() throws Throwable {

		Scanner sc = new Scanner(System.in);
		int option4;
		boolean exit4 = true;
		do {

			System.out.println(" 1- Create Items Table  ");
			System.out.println(" 2- Create Invoice Table ");
			System.out.println(" 3- Create Shop Name Table ");
			System.out.println(" 0- Exit ");

			option4 = sc.nextInt();

			switch (option4) {

			case 1:

				CreateItemTable.itemTable();

				break;

			case 2:

				CreateInvoiceTable.invoiceTable();

				break;

			case 3:

				CreateShopNameTable.shopTable();

				break;

			case 0:

				exit4 = false;
				break;

			default:

				DefaultClass.defaultAction();

			}
		} while (exit4);

	}

}
