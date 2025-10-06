package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void delete(Connection conn,String name){
        try{
            PreparedStatement stm1=conn.prepareStatement("Delete from students where name=?");
            stm1.setString(1,name);
            stm1.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
