package agroceriesShop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateInvoiceTable {
	
	
	public static void invoiceTable(){
	Connection conn;
	String url = "jdbc:sqlserver://localhost:1433;databaseName=SoloProjectBatch1;encrypt=true;trustServerCertificate=true";
	String user = "sa";
	String pass = "root";

	try (Connection conn1 = DriverManager.getConnection(url, user, pass);
			Statement stmt = conn1.createStatement();) {
		String sql = "CREATE TABLE Invoice " + "( Id int PRIMARY KEY IDENTITY(1,1)," + " Name VARCHAR(1000),"
				+ " Phone_Number INTEGER ," + " Invoice_Date VARCHAR(1000) ," + " Number_Of_Items INTEGER ,"
				+ " Total_Amount INTEGER," + " Paid_Amount INTEGER ," + " Balance INTEGER ," + " Total float,)";

		stmt.executeUpdate(sql);
		System.out.println("Created table in given database...");
	} catch (SQLException e) {
		e.printStackTrace();
	}

}}
