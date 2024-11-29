import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/mypetadoptionsystem";
    private static final String USER = "root";
    private static final String PASSWORD = "needgidni";

    // Starts the connection to the database
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD); // Establish connection
            System.out.println("Connection Successful");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage()); // Handle connection error
        }
        return connection; // Return the connection object
    }

    // Closes the database connection
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close(); // Close the connection
                System.out.println("Connection closed");
            } catch (SQLException e) {
                System.out.println("Error closing the connection: " + e.getMessage()); // Handle closing error
            }
        }
    }
}
