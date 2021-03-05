import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class HomeDemo extends JPanel
{
	JButton b1,b2;
	//ImageIcon i;
    //Image im;
	HomeDemo(FDemo f)
	{
		setLayout(null);
		b1 = new JButton("Login");
		b1.setBounds(200,50,200,30);
		  b1.setForeground(Color.black);
        b1.setBackground(Color.gray);
		add(b1);

       
        b2 = new JButton("Registration");
        b2.setBounds(200,100,200,30);
          b2.setForeground(Color.black);
        b2.setBackground(Color.gray);
		add(b2);
		

		 b1.addActionListener(f);
		 b2.addActionListener(f);
	}
	 public void paintComponent(Graphics g)
    {
    	
        g.drawImage(new ImageIcon("home.png").getImage(),0,0,null);
    }
}


