package agroceriesShop;

import java.util.Scanner;
import java.util.Stack;

public class WelcomeClass {
	
	public static void welcomeMassege() {
		Scanner sc = new Scanner(System.in);

		System.out.println("WELCOME TO CODE LINE HYPER MARKIT SYSTEM ");
		System.out.println("Please Press Enter key to continue...");
		sc.nextLine();
	}
	

	public static void userLogin() {

		boolean isUser = true;

		Scanner sc = new Scanner(System.in);
		Stack<String> historyStack = new Stack<>();

		while (isUser) {
			System.out.println("Entere user name");
			String userName = sc.next();
			historyStack.push(userName);

			try {
				if (!userName.equals("SAID")) {
					throw new Exception("user name is wrong");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}

			System.out.println("Entere user Password");
			String userPass = sc.next();
			historyStack.push(userPass);

			try {
				if (!userPass.equals("said")) {
					throw new Exception("user Password is wrong");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		isUser = false;

	}
}
