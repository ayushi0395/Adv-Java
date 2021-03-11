import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class HomePage extends JPanel
{
	JButton b1,b2;
	HomePage(FDemo f)
	{
		setLayout(null);
       b1=new JButton("Admin");
       b1.setBounds(300,100,150,50);
       add(b1);

       b2=new JButton("User");
       b2.setBounds(300,200,150,50);
       add(b2);

       b1.addActionListener(f);
       b2.addActionListener(f);
	}
	 public void paintComponent(Graphics g)
    {
    	
        g.drawImage(new ImageIcon("home.png").getImage(),0,0,null);
    }
}