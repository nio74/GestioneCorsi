package it.nio74.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	
		
		private static String jdbcURL = "jdbc:mysql://localhost:8889/iscritticorsi?user=root&password=root" ;
		
		public static Connection getConnection() {
		
			Connection conn;
			
			try {
				 conn = DriverManager.getConnection(jdbcURL) ;
				
				
			} catch (SQLException e) {
				
				System.err.println("Errore connessione al DB");
				throw new RuntimeException(e);
			}
			return conn ;
		
		}
		

}