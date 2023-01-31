package agroceriesShop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateItemTable {

	public static void itemTable() {

		Connection conn;
		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		try (Connection conn1 = DriverManager.getConnection(url, user, pass);
				Statement stmt = conn1.createStatement();) {
			String sql = "CREATE TABLE GroceryItems " + "( Id int PRIMARY KEY IDENTITY(1,1),"
					+ " Item_Name VARCHAR(1000)," + " Quantity INTEGER," + " Unit_Price float,"
					+ " Qty_Amount float ,)";

			stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
