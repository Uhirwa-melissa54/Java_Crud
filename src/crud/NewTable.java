package crud;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewTable {
    private static ResultSet res=null;
    public static void newTable(Connection conn, DefaultTableModel model,ResultSet res){
        model.setRowCount(0);

        try {
            while (res.next()) {
                int id = res.getInt("id");
                String name2 = res.getString("name");
                String location2 = res.getString("location");
                String school2 = res.getString("school");
                model.addRow(new Object[]{id,name2,location2,school2});

            }
        }
        catch(SQLException f){
            System.out.println("Can not read from database");
            f.printStackTrace();
        }


    }
}
