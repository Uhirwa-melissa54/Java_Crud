package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
    public static Connection connect() {
        String url = System.getenv("db_url");
        String user = System.getenv("db_user");
        String pass = System.getenv("db_pass");
        try {
            Connection connectDB = DriverManager.getConnection(url, user, pass);
            System.out.println("Database connected successfully");
            return connectDB;
        } catch (SQLException e) {
            System.out.println("Error connecting database");
            e.printStackTrace();
            return null;
        }
    }

}
