package agroceriesShop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteItemClass {

	public static void deleteItemsFromTable() throws Throwable {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";
		Connection con;

		// Reference to connection interface
		con = DriverManager.getConnection(url, user, pass);

		// Creating a statement
		Statement st = con.createStatement();

		Scanner sc = new Scanner(System.in);

		System.out.println(" Please Enter The Item Name To Delete The Row");
		String userInput = sc.next();
		String sqlQueryToDelete = "DELETE FROM GroceryItems WHERE Item_Name = '" + userInput + "'";
		try {
			Statement statement = con.createStatement();
			int resultSet = statement.executeUpdate(sqlQueryToDelete);

			System.out.println("The Item Name " + userInput + " Has Been Deleted ");

		} catch (Exception ex) {
			System.err.println(ex);
		}

	}
}
