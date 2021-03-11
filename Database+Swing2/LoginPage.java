import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class LoginPage extends JPanel
{
	JTextField tx1;
	JPasswordField tx2;
	JLabel u1,u2;
	JButton b1;
	LoginPage(FDemo f)
	{
		setLayout(null);
        u1=new JLabel("Enter Name");
        u1.setForeground(Color.white);
        u1.setBounds(100,150,100,20);
        add(u1);

        tx1=new JTextField(20);
        tx1.setBounds(200,150,100,20);
        add(tx1);

        u2=new JLabel("Enter Password");
        u2.setForeground(Color.white);
        u2.setBounds(100,200,100,20);
        add(u2);

        tx2=new JPasswordField(20);
        tx2.setBounds(200,200,100,20);
        add(tx2);


         b1=new JButton("Login");
         b1.setBounds(150,250,100,20);
         add(b1);

         b1.addActionListener(f);
	}
	 public void paintComponent(Graphics g)
    {
    	
        g.drawImage(new ImageIcon("login.png").getImage(),0,0,null);
    }
}