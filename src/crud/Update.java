package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static void updateSchool(Connection conn,String newSchool,String name){
        try {
            PreparedStatement stm1 = conn.prepareStatement("UPDATE students set school=? where name=?");
            stm1.setString(1,newSchool);
            stm1.setString(2,name);
            stm1.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
    public static void updateLocation(Connection conn,String newLocation,String name){
        try {
            PreparedStatement stm1 = conn.prepareStatement("UPDATE students set location=? where name=?");
            stm1.setString(1,newLocation);
            stm1.setString(2,name);
            stm1.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

}
