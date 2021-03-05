import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import java.awt.Component.*;
class RegisterDemo extends JPanel implements ActionListener//eyListener
{
    
    JButton b1,b2;
    JLabel u1,u2,u3;
    JTextField tx1,tx2,tx3;
   // JPasswordField tx2;
     RegisterDemo(FDemo f)
    {
        setLayout(null);
        u1=new JLabel("Enter Name ");
        u1.setForeground(Color.white);
        u1.setSize(80,30);
        u1.setLocation(100,80);
        add(u1);

        tx1=new JTextField("Enter name");
        tx1.setSize(150,25);
        tx1.setLocation(190,80);
        tx1.setForeground(Color.gray);
        add(tx1);

        u2=new JLabel("Enter Password");
        u2.setForeground(Color.white);
        u2.setSize(80,30);
        u2.setLocation(100,130);
        add(u2);

        tx2=new JTextField("enter pass");
        tx2.setSize(150,25);
        tx2.setLocation(190,130);
         tx2.setForeground(Color.gray);
        add(tx2);

        u3=new JLabel("Enter email");
        u3.setForeground(Color.white);
        u3.setSize(80,30);
        u3.setLocation(100,170);
        add(u3);

        tx3=new JTextField("enter email");
        tx3.setSize(150,25);
        tx3.setLocation(190,170);
         tx3.setForeground(Color.gray);
        add(tx3);

        b1=new JButton("Registration");
        b1.setSize(150,50);
        b1.setLocation(200,250);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        add(b1);

         b2=new JButton("LOGIN");
        b2.setSize(150,50);
        b2.setLocation(200,310);
          b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        add(b2);

        

        b1.addActionListener(this);  
        b2.addActionListener(f);  
/*
        tx1.addKeyListener(this);
        tx2.addKeyListener(this);
        tx3.addKeyListener(this);
*/        
    }
    public void actionPerformed(ActionEvent e)
    {
            String s1 = tx1.getText();
            String s2 = tx2.getText();
            String s3 = tx3.getText();
            try
            {
                Class.forName("com.mysql.jdbc.Driver");

                /*
                String db_url="jdbc:mysql://localhost:3306/java?useSSl=false";
                String db_uname="root";
                String db_upass="@yushi09";
                Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
                 */
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false","root","@yushi09");
                Statement st=con.createStatement();

                String q="insert into register values('"+s1+"','"+s2+"','"+s3+"')";
                st.executeUpdate(q);

                    // System.out.println("ok");
                    JOptionPane.showMessageDialog(null,"You Register successfully:)");
                    tx1.setText("");
                    tx2.setText("");
                    tx3.setText("");

                con.close();
            }
            catch(Exception e1)
            {
                System.out.println(e1);
            }
           
    }
   
     public void paintComponent(Graphics g)
    {
        
        g.drawImage(new ImageIcon("reg.png").getImage(),0,0,null);
    }

        
     
}
   /*
class placeh extends RegisterDemo implements KeyListener
{
    placeh()
    {
        tx1.addKeyListener(this);
        tx2.addKeyListener(this);
        tx3.addKeyListener(this);
        
        
    }

    public void KeyReleased(KeyEvent e)
    {
        String a=tx1.getText().trim();
         String b=tx2.getText().trim();
          String c=tx3.getText().trim();

          if(a.equals(""))
          {
            tx1.setText("enter name ");
            tx1.setForeground(Color.gray);
          }
          if(b.equals(""))
          {
            tx1.setText("enter Password ");
            tx1.setForeground(Color.gray);
          }
          if(c.equals(""))
          {
            tx1.setText("enter email ");
            tx1.setForeground(Color.gray);
          }
    }
    public void KeyPressed(KeyEvent e)
    {
        String a=tx1.getText();
        String b=tx1.getText();
        String c=tx1.getText();


        if(a.equals("enter name"))
        {
            tx1.setBackground(Color.black);
            tx1.setText("");
        }
        if(b.equals("enter Password"))
        {
            tx2.setBackground(Color.black);
            tx2.setText("");
        }
        if(c.equals("enter email"))
        {
            tx3.setBackground(Color.black);
            tx3.setText("");
        }

    }
    public void KeyTyped(KeyEvent e)
    {}
   }
  */ 