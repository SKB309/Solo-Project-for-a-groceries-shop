package agroceriesShop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertInItems {

	public static void insertItems() {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Item Name");
		String Item_Name = scanner.next();

		System.out.println("Enter Quantity");
		Integer Quantity = scanner.nextInt();

		System.out.println("Enter Unit Price");
		float Unit_Price = scanner.nextFloat();

//		System.out.println("Enter Qty Amount");
//		float Qty_Amount = scanner.nextInt();

		String sql = "Insert into GroceryItems values( '" + Item_Name + "'," + Quantity + "," + Unit_Price + ","
				+ Quantity * Unit_Price + ")";

		// Connection class object
		Connection con;

		// Try block to check for exceptions
		try {

			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			// Creating a statement
			Statement st = con.createStatement();

			// Executing query
			int m = st.executeUpdate(sql);
			if (m >= 1)
				System.out.println("inserted successfully : " + sql);
			else
				System.out.println("insertion failed");

			// Closing the connections
			con.close();
		}

		// Catch block to handle exceptions
		catch (Exception ex) {
			// Display message when exceptions occurs
			System.err.println(ex);
		}

	}
}
