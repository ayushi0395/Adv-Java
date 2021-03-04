//a welcome page 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
    JButton b1,b2;
    FirstPage fp;
    About ab ;
    Login log;
    Container cn = getContentPane();
    CardLayout card;
    FDemo ()
    {
        
         card = new CardLayout();
         setLayout(card);

        fp =new FirstPage(this);
        cn.add("FirstPage",fp);

        ab =new About(this);
        cn.add("About",ab);

        log = new Login(this);
        cn.add("Login",log); 
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==fp.b1)
        {
            card.show(cn,"About");
        }
        if(e.getSource()==fp.b2)
        {
            card.show(cn,"Login");
        }
        if(e.getSource()==ab.b1)
        {
            card.show(cn,"FirstPage");
        }
        if(e.getSource()==log.b2)
        {
            card.show(cn,"FirstPage");
        }
    }

}
class WELLCOME
{
    public static void main(String ar[])
    {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}
