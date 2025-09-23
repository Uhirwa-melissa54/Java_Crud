import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args){
        JFrame frame1=new JFrame();
        JPanel panel1= new JPanel();
        //title
        JLabel label1=new JLabel("Java | CRUD Operation");
        label1.setFont(new Font("Dialogo",Font.BOLD,20));
        label1.setForeground(Color.black);
        label1.setBounds(10,3,600,20);

        //subtitle
        JLabel label2=new JLabel("Personal Information");
        label2.setFont(new Font("Dialogo",Font.PLAIN,15));
        label2.setForeground(Color.black);
        label2.setBounds(10,25,600,15);

        //Form
        //field1
        JPanel field1=new JPanel();
        JLabel label3=new JLabel("Full names");
        label3.setFont(new Font("Dialogo",Font.PLAIN,17));
        label3.setForeground(Color.black);
        JTextField name1=new JTextField();
        field1.add(label3);
        field1.add(name1);
        field1.setBounds(3,3,300,15);

        //field2
        JPanel field2=new JPanel();
        JLabel label4=new JLabel("Full names");
        label4.setFont(new Font("Dialogo",Font.PLAIN,17));
        label4.setForeground(Color.black);
        JTextField location=new JTextField();
        field1.add(label4);
        field1.add(location);
        field1.setBounds(3,15,300,15);

        //field3
        JPanel field3=new JPanel();
        JLabel label5=new JLabel("Full names");
        label5.setFont(new Font("Dialogo",Font.PLAIN,17));
        label5.setForeground(Color.black);
        JTextField school=new JTextField();
        field1.add(label5);
        field1.add(school);
        field1.setBounds(3,30,300,15);

        //buttons
        JPanel buttons=new JPanel();
        JButton btnAdd=new JButton("Add");
        JButton btnUpdate=new JButton("Update");
        JButton btnDelete=new JButton("Delete");
        JButton btnNew=new JButton("New");
        buttons.add(btnAdd);
        buttons.add(btnUpdate);
        buttons.add(btnDelete);
        buttons.add(btnNew);
        buttons.setLayout(null);
        buttons.setBounds(10,450,600,100);

        //panel
        panel1.setBounds(10,25,600,500);
        panel1.add(field1);
        panel1.add(field2);
        panel1.add(field3);







        frame1.add(label1);
        frame1.add(label2);
        frame1.add(panel1);
        frame1.add(buttons);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}