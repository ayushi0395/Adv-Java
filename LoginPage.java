

import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
    
    Container cn = getContentPane();
    CardLayout card;
    HomeDemo home;
    LoginDemo login;
    MenuDemo menu;
    FDemo ()
    {
         card = new CardLayout();
         setLayout(card);
         home =new HomeDemo(this);
         login =new LoginDemo(this);
         menu =new MenuDemo(this);

         cn.add("home",home);
         cn.add("login",login);
         cn.add("menu",menu);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==home.b1)
        {
            card.next(cn);
        }
        if(e.getSource()==login.b1)
        {
            String s1 = login.tx1.getText();
            String s2 = login.tx2.getText();
            if(s1.equals("abc") && s2.equals("123"))
            {
            card.next(cn);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid username or password !!!");
            }
        }

    }

}
class LOGINPAGE
{
    public static void main(String ar[])
    {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}
