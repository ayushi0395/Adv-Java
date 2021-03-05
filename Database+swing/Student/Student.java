import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class FDemo extends JFrame implements ActionListener
{
    
    Container cn = getContentPane();
    CardLayout card;
    HomeDemo home;
    LoginDemo login;
    MenuDemo menu;
    RegisterDemo reg;
    ImageIcon i;
    Image im;
    FDemo ()
    {
         card = new CardLayout();
         setLayout(card);

         home =new HomeDemo(this);
         login =new LoginDemo(this);
         menu =new MenuDemo(this);
         reg = new RegisterDemo(this);

         cn.add("home",home);
         cn.add("login",login);
         cn.add("menu",menu);
         cn.add("reg",reg);
    }

     public void paintComponent(Graphics g)
    {
        //super.paintComponent(g);
         ImageIcon i= new ImageIcon("home.png");
        Image im =i.getImage();
        g.drawImage(im,0,0,null);
     //   super.paintComponent(g);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==home.b1)
        {
            card.next(cn);
        }
        if(e.getSource()==login.b1)
        {
            String s1=login.tx1.getText();
            String s2=login.tx2.getText();
            try{    Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false","root","@yushi09");
                Statement st=con.createStatement();
                String q="select * from register where NAME='"+s1+"' AND  Pass='"+s2+"'";
                ResultSet rs=st.executeQuery(q);
                if(rs.next())
                    {  card.next(cn);  }
                else
                {
                    JOptionPane.showMessageDialog(null,"Inavlid username or pass :-");
                }    
                con.close();
                }
            catch(Exception e1)
            {
                System.out.println(e1);
            }
        }
        if(e.getSource()==home.b2)
        {
            card.show(cn,"reg");
        }
        if(e.getSource()==reg.b2)
        {
            card.show(cn,"login");
        }

        



}
}
class Student
{
    public static void main(String ar[])
    {
        FDemo f2 = new FDemo();
        f2.setVisible(true);
        f2.setBounds(100,100,700,500);
        f2.setDefaultCloseOperation(f2.EXIT_ON_CLOSE);
    }
}

