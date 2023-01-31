package agroceriesShop;

import java.util.Scanner;

public class ExitClass {

	public static void toExit() {

		Scanner sc = new Scanner(System.in);

		boolean isExitSystem = true;
		String yes = null;

		System.out.println("Are you sure you want to exit? yes, program ends,if No , main menu reprinted again");
		String exitSystem = sc.next();
		if (exitSystem == yes) {
			isExitSystem = false;

		}

		System.out.println("* * * * * * *  Exit  * * * * * * * * * *");
		System.out.println("* * * * * *  THANK YOU  * * * * * * * *");
		System.out.println("**********SEE YOU SOON *************");
//	" + userName + "

	}
}
