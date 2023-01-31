package agroceriesShop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertInInvoice {

	public static void InsertInInvoiceTables() {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Invoice Name");
		String Name = scanner.next();

		System.out.println("Enter Phone Number");
		Integer Phone_Number = scanner.nextInt();

		System.out.println("Enter Invoice Date");
		String Invoice_Date = scanner.next();

		System.out.println("Enter Number Of Items");
		Integer Number_Of_Items = scanner.nextInt();

		System.out.println("Enter Total Amount");
		Integer Total_Amount = scanner.nextInt();

		System.out.println("Enter Paid Amount");
		Integer Paid_Amount = scanner.nextInt();

		System.out.println("Enter Balance");
		Integer Balance = scanner.nextInt();

		System.out.println("Enter Total");
		Integer Total = scanner.nextInt();

		String sql = "Insert into Invoice values( '" + Name + "'," + Phone_Number + ",'" + Invoice_Date + "',"
				+ Number_Of_Items + "," + Total_Amount + "," + Paid_Amount + "," + Balance + "," + Total + ")";

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
