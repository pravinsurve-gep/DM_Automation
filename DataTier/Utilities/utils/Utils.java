package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {

	
	public static Connection  getDbConnection() {
		 String connectionUrl =
	                "jdbc:sqlserver://gepqcdirect.database.windows.net:1433;"
	                + "database=QC_SalesDemo_ShouldCost;"
	                + "user=RM_DBReader;"
	                + "password=Password@123;"
	                + "encrypt=true;"
	                + "trustServerCertificate=false;"
	                + "loginTimeout=30;";
		 Connection conn = null ;

	      try {
	    	  conn = DriverManager.getConnection(connectionUrl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
