package crud;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Create {
    public static int create(String names, String location, String school, Connection conn){

        try {
            PreparedStatement checkExistence= conn.prepareStatement("SELECT COUNT(*) FROM students WHERE name=? AND location=? AND school=?");
            checkExistence.setString(1,names);
            checkExistence.setString(2,location);
            checkExistence.setString(3,school);
            ResultSet exist=checkExistence.executeQuery();
            exist.next();
            if (exist.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "User Already existsD!","Error",JOptionPane.ERROR_MESSAGE);
            }
            else {
                PreparedStatement insertStudent = conn.prepareStatement("Insert into students(name,location,school) values(?,?,?)");
                insertStudent.setString(1, names);
                insertStudent.setString(2, location);
                insertStudent.setString(3, school);
                int res = insertStudent.executeUpdate();
                System.out.println(res + "record inserted");
                return res;
            }

        }
        catch(SQLException e){
            System.out.println("Error inserting in database");
            e.printStackTrace();
        }
        return 0;
    }
}
