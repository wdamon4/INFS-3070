package week14Examples;

import java.sql.*;

public class singleFileConnection {

	public static void main(String[] args) {

		try {
		
		// create variables for database connection
		String url = "jdbc:mysql://localhost/infs3070";
		String user = "infsclass";
		String password = "webclass";
		Connection conn = null;
		Statement sqlQuery = null;
		ResultSet results = null;
		
		
		// connecting to the database
		
			conn = DriverManager.getConnection(url, user, password);
			
			// create an object to execute sql statements
			sqlQuery = conn.createStatement();
			
			// use string to send sql statement to the database
			results = sqlQuery.executeQuery("SELECT * FROM students");
			
			// display results in console, we use a loop to read all the data
			while (results.next()) {
				
				// formatting the console output
				System.out.printf("%s %-15s %-15 %s \n",
						results.getString("StudentID"),
						results.getString("LastName"),
						results.getString("FirstName"),
						results.getString("Email"));
				
			}
			
			conn.close();
			System.out.println("-----------------------------------------------------");
	        System.out.println("Connection to database closed.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
