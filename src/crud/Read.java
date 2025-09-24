package crud;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {
    public static ResultSet read(Connection conn){
        try {
            PreparedStatement retrieve = conn.prepareStatement("SELECT * FROM students");
            ResultSet result = retrieve.executeQuery();
        }
        catch(SQLException e){
            e.printStackTrace();cd
        }



    }
}
