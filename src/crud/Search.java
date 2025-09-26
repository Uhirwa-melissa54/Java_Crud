package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Search {
    public  static void search(Connection conn,int id){
        try {
            PreparedStatement stm1 = conn.prepareStatement("Select * from students where id=?");
            stm1.setInt(1,id);
        }
        catch (SQLException e){
            System.out.println("Searching failed");
            e.printStackTrace();
        }

    }

    public static void searchByName(Connection conn, String names){
        try {
            PreparedStatement stm1 = conn.prepareStatement("Select * from students where name=?");
            stm1.setString(1,names);
        }
        catch (SQLException e){
            System.out.println("Searching failed");
            e.printStackTrace();
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
