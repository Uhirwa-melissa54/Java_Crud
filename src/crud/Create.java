package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create {
    public static int create(String names, String location, String school, Connection conn){

        try {
            PreparedStatement insertStudent = conn.prepareStatement("Insert into students(name,location,school) values(?,?,?)");
            insertStudent.setString(1,names);
            insertStudent.setString(2,location);
            insertStudent.setString(3,school);
             int  res=insertStudent.executeUpdate();
            System.out.println(res+"record inserted");
            return res;

        }
        catch(SQLException e){
            System.out.println("Error inserting in database");
            e.printStackTrace();
        }
        return 0;
    }
}
