import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class termsPage extends JPanel
{
     JLabel u1;
     JRadioButton b1;
     JButton b2;
	termsPage(FDemo f)
	{
       setLayout(null);
       f.setBackground(Color.black);

       u1=new JLabel("s");
       u1.setBounds(50,50,200,200);
       add(u1);

       b1= new JRadioButton("I agree terms and conditions");
       b1.setBounds(200,370,300,20);
       add(b1);

       b2= new JButton("Start the Test!");
       b2.setBounds(200,400,200,50);
       add(b2);
  
       b1.addActionListener(f);
       b2.addActionListener(f);
	}
	public void paintComponent(Graphics g)
	{
         g.drawImage(new ImageIcon("terms.png").getImage(),50,50,null);
	}
}