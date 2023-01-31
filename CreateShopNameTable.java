package agroceriesShop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateShopNameTable {

	public static void shopTable() {

		Connection conn;
		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		try (Connection conn1 = DriverManager.getConnection(url, user, pass);
				Statement stmt = conn1.createStatement();) {
			String sql = "CREATE TABLE Shop_Name " + "( Id int PRIMARY KEY IDENTITY(1,1),"
					+ " Name_Of_Shop VARCHAR(1000),)";

			stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
