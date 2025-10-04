package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Search {

    public  static ResultSet search(Connection conn,int id){
        try {
            PreparedStatement stm1 = conn.prepareStatement("Select * from students where id=?");
            stm1.setInt(1,id);
            ResultSet res= stm1.executeQuery();
            return res;
        }
        catch (SQLException e){
            System.out.println("Searching failed");
            e.printStackTrace();
            return null;
        }

    }

    public static ResultSet searchByName(Connection conn, String names){
        try {
            PreparedStatement stm1 = conn.prepareStatement("Select * from students where name=?");
            stm1.setString(1,names);
            ResultSet res=stm1.executeQuery();
            return res;
        }
        catch (SQLException e){
            System.out.println("Searching failed");
            e.printStackTrace();
            return null;
        }
    }

    public static void searchByLocation(Connection conn,String location){
        try {
            PreparedStatement stm1 = conn.prepareStatement("Select * from students where location=?");
            stm1.setString(1,location);
        }
        catch (SQLException e){
            System.out.println("Searching failed");
            e.printStackTrace();
        }

    }
}
