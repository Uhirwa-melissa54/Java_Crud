package crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {
    public static ResultSet read(Connection conn){
        try {
            PreparedStatement retrieve = conn.prepareStatement("SELECT * FROM students");
            ResultSet result = retrieve.executeQuery();
            return result;
        }
        catch(SQLException e){
            System.out.println("Error retrieving data");
            e.printStackTrace();
            return null;
        }




    }
}
