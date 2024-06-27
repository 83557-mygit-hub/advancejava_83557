package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public interface IdbUtil {
	
		String DB_URL = "jdbc:mysql://localhost:3306/btsdb";
		String USERNAME = "root";
		String PASSWORD = "omkar123";

		static Connection getConnection() throws SQLException {
			return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		}
	}

