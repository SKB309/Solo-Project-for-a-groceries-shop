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
	


	
	public static boolean checkLogin(String username, String password) {
	    Scanner sc = new Scanner(System.in);
	    boolean isValid = false;

	    while (!isValid) {
	      System.out.print("Enter username: ");
	      String userInput = sc.nextLine();
	      System.out.print("Enter password: ");
	      String passInput = sc.nextLine();

	      if (userInput.equals("SAID") && passInput.equals("said")) {
	        System.out.println("Login successful!");
	        isValid = true;
	      } else {
	        System.out.println("Invalid username or password. Try again.");
	      }
	    }
	    sc.close();
	    return isValid;
	  }

	
	public static void main(String[] args) throws Throwable {
		
		
}}
