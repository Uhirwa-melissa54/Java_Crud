package crud;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.xml.transform.Result;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    private static int result=0;
    public static void main(String[] args) {
        JFrame frame1 = new JFrame();
        frame1.setSize(650, 550);
        frame1.setLayout(null);

        // Title
        JLabel label1 = new JLabel("Java | CRUD Operation");
        label1.setFont(new Font("Dialog", Font.BOLD, 20));
        label1.setBounds(10, 5, 400, 30);
        frame1.add(label1);

        // Panel
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        TitledBorder titleBorder = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.gray, 2),
                "Personal Information",
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("Dialog", Font.BOLD, 16),
                Color.black
        );
        panel1.setBorder(titleBorder);
        panel1.setBounds(10, 40, 600, 250);

        // Field1 - Full names
        JPanel field1 = new JPanel(null);
        field1.setBounds(20, 30, 550, 40);
        JLabel label3 = new JLabel("Full names:");
        label3.setBounds(0, 0, 100, 25);
        JTextField name1 = new JTextField();
        name1.setBounds(90, 0, 200, 25);
        field1.add(label3);
        field1.add(name1);

        // Field2 - Location
        JPanel field2 = new JPanel(null);
        field2.setBounds(20, 80, 550, 40);
        JLabel label4 = new JLabel("Location:");
        label4.setBounds(0, 0, 100, 25);
        JTextField location = new JTextField();
        location.setBounds(90, 0, 200, 25);
        field2.add(label4);
        field2.add(location);

        // Field3 - School
        JPanel field3 = new JPanel(null);
        field3.setBounds(20, 130, 550, 40);
        JLabel label5 = new JLabel("School:");
        label5.setBounds(0, 0, 100, 25);
        JTextField school = new JTextField();
        school.setBounds(90, 0, 200, 25);
        field3.add(label5);
        field3.add(school);

        // Add fields to panel
        panel1.add(field1);
        panel1.add(field2);
        panel1.add(field3);
        //database connection
            Connection conn = ConnectDatabase.connect();
        // Buttons
        JPanel buttons = new JPanel();
        buttons.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
        buttons.setBounds(10, 300, 600, 50);
        JButton addButton=new JButton("Add");
        buttons.add(addButton);

        //add datamodel
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Location");
        model.addColumn("School");

        //create table
        JTable table=new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10,400,500,200);


        //buttons
        JButton readButton=new JButton("Retrieve");
        buttons.add(readButton);
        readButton.addActionListener(e->{
            NewTable.newTable(conn,model);
        });


        addButton.addActionListener(e -> {
            String fullnames=name1.getText();
            String location3=location.getText();
            String school1=school.getText();
            if(!fullnames.trim().isEmpty() && !location3.trim().isEmpty() && !school1.trim().isEmpty()){
                result=Create.create(fullnames,location3,school1,conn);
                NewTable.newTable(conn,model);

            }
            else{
                JOptionPane.showMessageDialog(null,"All fields are required", "Error",JOptionPane.ERROR_MESSAGE);

            }
        });
        if(result!=0){
            System.out.println(result + "records inserted in database");
        }
        buttons.add(new JButton("Update"));
        buttons.add(new JButton("Delete"));


        // Add panels to frame
        frame1.add(scrollPane);
        frame1.add(panel1);
        frame1.add(buttons);

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);





    }
}
