package agroceriesShop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateingTables {
	
	public static void invoiceTable() {
		Connection conn;
		String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		try (Connection conn1 = DriverManager.getConnection(url, user, pass);
				Statement stmt = conn1.createStatement();) {
			String sql = "CREATE TABLE Invoice " + "( Id int PRIMARY KEY IDENTITY(1,1)," + " Customer_Name VARCHAR(1000),"
					+ " Phone_Number INTEGER ," + " Invoice_Date VARCHAR(1000) ," + " Number_Of_Items INTEGER ,"
					+ " Total_Amount INTEGER," + " Paid_Amount INTEGER ," + " Balance INTEGER ," + " Total float,)";

			stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
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

