import javax.swing.*;
class LoginDemo extends JPanel
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
        add(u1);

        tx1=new JTextField(20);
        tx1.setSize(150,25);
        tx1.setLocation(190,80);
        add(tx1);

        u2=new JLabel("Enter Password");
        u2.setSize(80,30);
        u2.setLocation(100,130);
        add(u2);

        tx2=new JPasswordField(20);
        tx2.setSize(150,25);
        tx2.setLocation(190,130);
        add(tx2);

        b1=new JButton("Login");
        b1.setSize(80,35);
        b1.setLocation(210,170);
        add(b1);

        b1.addActionListener(f);
        
	}
}