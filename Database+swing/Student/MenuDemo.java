import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class MenuDemo extends JPanel
{
	Insert ins;
	Search src;
	Update upd;
	Delete del;
	Show show;
	JTabbedPane tab1;
	MenuDemo(FDemo f)
	{
		setLayout(new BorderLayout());
		tab1 = new JTabbedPane();

		ins =new Insert();
		tab1.addTab("Insert",ins);

		src = new Search();
		tab1.addTab("Search",src);
		add(tab1);

		upd = new Update();
		tab1.addTab("Update",upd);
		add(tab1);

		del=new Delete();
		tab1.addTab("Delete",del);
		add(tab1);

		show=new Show();
		tab1.addTab("Show",show);
		add(tab1);

	}
     public void paintComponent(Graphics g)
    {
        
        g.drawImage(new ImageIcon("menu.png").getImage(),0,0,null);
    }
}

class Insert extends JPanel implements ActionListener
{
    JLabel u1,u2,u3,u4,u5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1;
    Insert()
    {
    	setLayout(null);
    	u1=new JLabel("Enter roll");
    	u1.setBounds(100,100,120,30);
    	add(u1);

    	t1=new JTextField();
    	t1.setBounds(200,100,120,30);
    	add(t1);

    	
    	u2=new JLabel("Enter name");
    	u2.setBounds(100,150,120,30);
    	add(u2);

    	t2=new JTextField();
    	t2.setBounds(200,150,120,30);
    	add(t2);

    	
    	u3=new JLabel("Enter phy");
    	u3.setBounds(100,200,120,30);
    	add(u3);

    	t3=new JTextField();
    	t3.setBounds(200,200,120,30);
    	add(t3);

    	
    	u4=new JLabel("Enter chem");
    	u4.setBounds(100,250,120,30);
    	add(u4);

    	t4=new JTextField();
    	t4.setBounds(200,250,120,30);
    	add(t4);

    	
    	u5=new JLabel("Enter maths");
    	u5.setBounds(100,300,120,30);
    	add(u5);

    	t5=new JTextField();
    	t5.setBounds(200,300,120,30);
    	add(t5);

        b1=new JButton("Click!!!");
        b1.setBounds(120,370,80,30);
        add(b1);
        b1.addActionListener(this);
    }
     public void paintComponent(Graphics g)
    {
        
        g.drawImage(new ImageIcon("show.png").getImage(),0,0,null);
    }
     public void actionPerformed(ActionEvent e)
    {
            String s1 = t1.getText();
            String s2 = t2.getText();
            String s3 = t3.getText();
            String s4 = t4.getText();
            String s5 = t5.getText();

            try
            {
                
                Class.forName("com.mysql.jdbc.Driver");

                /*
                String db_url="jdbc:mysql://localhost:3306/java?useSSl=false";
                String db_uname="root";
                String db_upass="@yushi09";
                Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
                 */
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false","root","@yushi09");
                Statement st=con.createStatement();

                String q="insert into marks values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
                st.executeUpdate(q);


                    // System.out.println("ok");
                    JOptionPane.showMessageDialog(null,"Your Data registered  successfully:)");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");


                con.close();
            }
            catch(Exception e1)
            {
                System.out.println(e1);
            }
 }  
 }

class Search extends JPanel implements ActionListener
{
	JLabel u1, u2, u3, u4, u5, t2, t3, t4, t5;
    JTextField t1;
    JButton b1;
	Search()
	{
		setLayout(null);
        u1 = new JLabel("Enter Roll No.");
        u1.setBounds(100, 50, 100, 50);
        add(u1);

        u2 = new JLabel();
        u2.setBounds(100, 50+50, 100, 50);
        add(u2);        

        u3 = new JLabel();
        u3.setBounds(100, 50+100, 100, 50);
        add(u3);

        u4 = new JLabel();
        u4.setBounds(100, 50+150, 100, 50);
        add(u4);

        u5 = new JLabel();
        u5.setBounds(100, 50+200, 100, 50);
        add(u5);

        t1 = new JTextField();
        t1.setBounds(250, 60, 300, 30);
        add(t1);
        t2 = new JLabel();
        t2.setBounds(250, 60+50, 300, 30);
        add(t2);
        t3 = new JLabel();
        t3.setBounds(250, 60+100, 300, 30);
        add(t3);
        t4 = new JLabel();
        t4.setBounds(250, 60+150, 300, 30);
        add(t4);
        t5 = new JLabel();
        t5.setBounds(250, 60+200, 300, 30);
        add(t5);

        b1 = new JButton("Search");
        b1.setBounds(570, 60, 100, 30);
        add(b1);
        b1.addActionListener(this);

	}
     public void paintComponent(Graphics g)
    {
        
        g.drawImage(new ImageIcon("search.png").getImage(),0,0,null);
    }
    public void actionPerformed(ActionEvent e)
    {
          if(e.getSource()==b1)
        { 
            System.out.println("hi");
           String s1=t1.getText();
           try
           {    Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false","root","@yushi09");
                Statement st=con.createStatement();
                String q="select * from marks where Uroll='"+s1+"'";
                ResultSet rs = st.executeQuery(q);
                
                if(rs.next())
            {
                t2.setText(rs.getString(2));
                t3.setText(rs.getString(3));
                t4.setText(rs.getString(4));
                t5.setText(rs.getString(5));
                u2.setText("Name");
                u3.setText("Physics Marks");
                u4.setText("Chemistry Marks");
                u5.setText("Maths Marks");
            }   
            else
            {
                JOptionPane.showMessageDialog(null, "Data not Found  :( ");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                u2.setText("");
                u3.setText("");
                u4.setText("");
                u5.setText("");
            }
            con.close();
            }
            catch(Exception e1)
            {
                System.out.println(e1);
            }
        }
    }
}
class Update extends JPanel  implements ActionListener

{
    
    JLabel u1;
    JTextField t1, t2, t3, t4, t5;
    JButton b1,b2;
    Update()
    {
        setLayout(null);
        u1=new JLabel("Enter Rollno");
        u1.setBounds(100,100,120,30);
        add(u1);

        t1=new JTextField();
        t1.setBounds(200,120,120,30);
        add(t1);

        b1=new JButton("Search");
        b1.setBounds(400,100,120,30);
        add(b1);

        t2=new JTextField();
        t2.setBounds(200,180,120,30);
        add(t2);

        t3=new JTextField();
        t3.setBounds(200,230,120,30);
        add(t3);

        t4=new JTextField();
        t4.setBounds(200,280,120,30);
        add(t4);

        t5=new JTextField();
        t5.setBounds(200,320,120,30);
        add(t5);

        b2=new JButton("Update");
        b2.setBounds(200,400,120,30);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }

     public void paintComponent(Graphics g)
    {
        
        g.drawImage(new ImageIcon("insert.png").getImage(),0,0,null);
    }
    public void actionPerformed(ActionEvent e)
    {
          String s1=t1.getText();
        if(e.getSource() == b1)
        try
        {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db_url = "jdbc:mysql://localhost:3306/java?useSSL=false";
            String db_uname = "root";
            String db_upass = "@yushi09";
            Connection con = DriverManager.getConnection(db_url, db_uname, db_upass);

            Statement st = con.createStatement();
            String q ="select * from marks where Uroll='"+s1+"'";
            ResultSet rs = st.executeQuery(q);
            if(rs.next())
            {
                t2.setText(rs.getString(2));
                t3.setText(rs.getString(3));
                t4.setText(rs.getString(4));
                t5.setText(rs.getString(5));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Data not Found");
             
            }
            con.close();
        }catch(Exception e1){System.out.println(e1);}

        if(e.getSource() == b2)
       {     String s2=t2.getText();
             String s3=t3.getText();
             String s4=t4.getText();
             String s5=t5.getText();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false","root","@yushi09");
            Statement st = con.createStatement();
            String q=
            "update marks set Uname='"+s2+"', Uphy='"+s3+"', Uchem='"+s4+"', Umaths='"+s5+"' where Uroll ='roll'";
            st.executeUpdate(q);
           
            JOptionPane.showMessageDialog(null,"Data Updated");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");

            con.close();
        }    
        catch(Exception e1){System.out.println(e1);}
        }
        
     }       
}
class Delete extends JPanel 
{
	JRadioButton rb;
	JLabel u1;
	JTextField t1;
	Delete()
	{
		setLayout(null);
        rb=new JRadioButton("Are you sure you want to Delete your details ?");
        rb.setBounds(100,20,300,70);
        //100,100,120,30
    	add(rb);

        u1=new JLabel("Enter Rollno.");
    	u1.setBounds(100,100,120,30);
    	add(u1);

    	t1=new JTextField();
    	t1.setBounds(200,100,120,30);
    	add(t1);

	}
     public void paintComponent(Graphics g)
    {
        
        g.drawImage(new ImageIcon("d.png").getImage(),0,0,null);
    }
}

class Show extends JPanel
{
	JLabel u1,u2;
    
	Show()
	{
        setLayout(null);

		u2=new JLabel("Details");
    	u2.setBounds(100,50,120,30);
    	add(u2);

    	
        
        try{    Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false","root","@yushi09");
                Statement st=con.createStatement();
                String q="select * from marks";
                ResultSet rs=st.executeQuery(q);
                  int y=100;
                  while(rs.next())
                  {
                    u1=new JLabel(rs.getString(1));
                    u1.setBounds(100,y,120,30);
                    add(u1);

                    u1=new JLabel(rs.getString(2));
                    u1.setBounds(200,y,120,30);
                    add(u1);

                    u1=new JLabel(rs.getString(3));
                    u1.setBounds(300,y,120,30);
                    add(u1);

                    u1=new JLabel(rs.getString(4));
                    u1.setBounds(400,y,120,30);
                    add(u1);

                    u1=new JLabel(rs.getString(5));
                    u1.setBounds(500,y,120,30);
                    add(u1);

                    y+=50;
                  }
                con.close();
                }
            catch(Exception e1)
            {
                System.out.println(e1);
            }
	}
     public void paintComponent(Graphics g)
    {
        
        g.drawImage(new ImageIcon("del.png").getImage(),0,0,null);
    }

}
