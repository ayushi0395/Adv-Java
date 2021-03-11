import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
    Container cn=getContentPane();
    CardLayout card;
    HomePage home;
    LoginPage login;
    termsPage tp;
    QuesPage ques;
   // Ques1 qs1;
    FDemo()
    {
         card = new CardLayout();
         setLayout(card);

         home = new HomePage(this);
         login =new LoginPage(this);
         tp=new termsPage(this);
         ques=new QuesPage(this);
        // qs1=new Ques1(this);

         cn.add("home",home);
         cn.add("login",login);
         cn.add("tp",tp);
         cn.add("ques",ques);
        // cn.add("qs1",qs1);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==home.b1)
        {
          card.next(cn);
        }
        if(e.getSource()==home.b2)
        {
            card.next(cn);
        }
        if(e.getSource()==login.b1)
        {
            card.next(cn);
        }
        if(e.getSource()==tp.b2)
        {
            card.next(cn);
        }
        if(e.getSource()==ques.b1)
        {
            card.next(cn);
        }

    }
}
class demo
{
    public static void main(String args[])
    {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}