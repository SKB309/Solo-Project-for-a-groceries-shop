package agroceriesShop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ChangeThePriceClass {
	
	
	public static void priceChange() throws Throwable {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";
		Connection con;

		// Reference to connection interface
		con = DriverManager.getConnection(url, user, pass);

		// Creating a statement
		Statement st = con.createStatement();

		System.out.println(" Please Enter Item Name To Update Unit Price");
		Scanner inputScanner = new Scanner(System.in);
		float userInput = inputScanner.nextInt();

		String sqlQueryToUpdate = "UPDATE GroceryItems SET Unit_Price =('" + userInput + "')";
		System.out.println(sqlQueryToUpdate);
		try {
			Statement statement = con.createStatement();
			int m = statement.executeUpdate(sqlQueryToUpdate);

		} catch (Exception ex) {
			System.err.println(ex);
		}

	}
}
