package finalExam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

	public static Connection connection() {
        
        // Create and initialize variables to connect to database
                    String url = "jdbc:mysql://128.198.162.204/INFS3070";
                    String user = "infsclass";
                    String password = "webclass";
                    Connection conn = null;
                    
                    // Database connection
                    try {
                        conn = DriverManager.getConnection(url, user, password);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    
                    // Just for esthetics
                    System.out.println("Connection to database created.");
                    System.out.println("------------------------------------------------------");
                    
                    // Since we set the type to Connection and not void we must return something
                    return conn;
    }

}
	

