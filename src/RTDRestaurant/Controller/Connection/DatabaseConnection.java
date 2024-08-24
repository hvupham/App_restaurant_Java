
package RTDRestaurant.Controller.Connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

// Kết nối tới DataBase của hệ thống

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private DatabaseConnection() {

    }
    //Thực hiện kết nối tới Database
    public void connectToDatabase() throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/Restaurant_Java";
        final String username = "root";
        final String password = "1234";
        connection = DriverManager.getConnection(url, username, password);
    }
 
    public Connection getConnection() {
        return connection;
    }
    
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}

