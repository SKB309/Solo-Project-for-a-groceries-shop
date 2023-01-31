package agroceriesShop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class AddItemsInTable {

	public static void addItemsIntoTable() {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter item name (or 'done' to finish): ");
			String Item_Name = sc.nextLine();
			if (Item_Name.equalsIgnoreCase("done")) {
				break;
			}

			System.out.print("Enter item quantity: ");
			Integer Quantity = Integer.parseInt(sc.nextLine());

			System.out.print("Enter item price: ");
			float Unit_Price = (float) Double.parseDouble(sc.nextLine());

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

}
