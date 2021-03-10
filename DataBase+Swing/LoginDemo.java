import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginDemo extends JPanel implements KeyListener
{
	
	JButton b1;
    JLabel u1,u2;
    JTextField tx1;
    JPasswordField tx2;
    LoginDemo(FDemo f)
    {
        setLayout(null);
        u1=new JLabel("Enter Name ");
        u1.setSize(80,30);
        u1.setLocation(100,80);
        u1.setForeground(Color.white);
        add(u1);

        tx1=new JTextField("Enter Name");
        tx1.setSize(150,25);
        tx1.setLocation(190,80);
        tx1.setForeground(Color.gray);
        add(tx1);

        u2=new JLabel("Enter Password");
        u2.setSize(80,30);
        u2.setLocation(100,130);
          u2.setForeground(Color.white);
        add(u2);

        tx2=new JPasswordField("Enter Pass");
        tx2.setSize(150,25);
        tx2.setEchoChar((char)0);
        tx2.setLocation(190,130);
        tx2.setForeground(Color.gray);
        add(tx2);

        b1=new JButton("Login");
        b1.setSize(80,35);
        b1.setLocation(210,170);
        add(b1);

        b1.addActionListener(f);
        tx1.addKeyListener(this);
        tx2.addKeyListener(this);
	}
    public  void keyReleased(KeyEvent e)
     {  String s1=tx1.getText().trim();
         String s2=tx2.getText().trim();
        
          if(s1.equals(""))
          {
            tx1.setText("Enter Name ");
            tx1.setForeground(Color.gray);
          }
          if(s2.equals(""))
          {
            tx2.setText("Enter Pass");
            tx2.setEchoChar((char)0);
            tx2.setForeground(Color.gray);
          }
    }  
     public   void keyPressed(KeyEvent e)
    {
        String s1=tx1.getText();
        String s2=tx2.getText();
       
        if(s1.equals("Enter Name"))
        {
            tx1.setForeground(Color.black);
            tx1.setText("");
        }
        if(s2.equals("Enter Pass"))
        {
            tx2.setForeground(Color.black);
            tx2.setEchoChar('*');
            tx2.setText("");
        }
    }
    public  void keyTyped(KeyEvent e)   {     }

     public void paintComponent(Graphics g)
    {
        
        g.drawImage(new ImageIcon("login.png").getImage(),0,0,null);
    }
}
