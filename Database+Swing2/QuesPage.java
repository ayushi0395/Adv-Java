import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class QuesPage extends JPanel  implements ActionListener
{
	JButton b1,b2,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15;
	JTextField t0,t1,t2,t3,t4;
	JRadioButton r1,r2,r3,r4;
    JLabel u1,u2,u3,u4;
    JButton currentStatus = this.q1;
	QuesPage(FDemo f)
	{
          setLayout(null);

          u1=new JLabel("*All question are compulsory and carry 5 marks each.");
          u1.setForeground(Color.white);
          u1.setBounds(50,40,350,30);
          add(u1);

          u2=new JLabel("*For any query call");
          u2.setForeground(Color.white);
          u2.setBounds(50,400,300,30);
          add(u2);

          u3=new JLabel("9847204753");
          u3.setForeground(Color.white);
          u3.setBounds(50,415,300,30);
          add(u3);

          u4=new JLabel("ALL THE BEST :) ");
          u4.setForeground(Color.white);
          u4.setBounds(200,20,300,30);
          add(u4);

          b1=new JButton("next");
          b1.setBounds(220,300,100,40);
          add(b1);

          b2=new JButton("previous");
          b2.setBounds(100,300,100,40);
          add(b2);

         
          q1=new JButton("1");
          q1.setBounds(480,100,50,30);
          q1.setBackground(Color.black);
          q1.setForeground(Color.white);
          add(q1);
          q2=new JButton("2");
          q2.setBounds(530,100,50,30);
           q2.setBackground(Color.black);
          q2.setForeground(Color.white);
          add(q2);
          q3=new JButton("3");
          q3.setBounds(580,100,50,30);
           q3.setBackground(Color.black);
          q3.setForeground(Color.white);
          add(q3);
          q4=new JButton("4");
           q4.setBackground(Color.black);
          q4.setForeground(Color.white);
          q4.setBounds(630,100,50,30);
          add(q4);
          q5=new JButton("5");
           q5.setBackground(Color.black);
          q5.setForeground(Color.white);
          q5.setBounds(480,130,50,30);
          add(q5);
          q6=new JButton("6");
           q6.setBackground(Color.black);
          q6.setForeground(Color.white);
          q6.setBounds(530,130,50,30);
          add(q6);

          q7=new JButton("7");
          q7.setBounds(580,130,50,30);
           q7.setBackground(Color.black);
          q7.setForeground(Color.white);
          add(q7);
          q8=new JButton("8");
           q8.setBackground(Color.black);
          q8.setForeground(Color.white);
          q8.setBounds(630,130,50,30);
          add(q8);
          q9=new JButton("9");
          q9.setBackground(Color.black);
          q9.setForeground(Color.white);
          q9.setBounds(480,160,50,30);
          add(q9);
          q10=new JButton("10");
           q10.setBackground(Color.black);
          q10.setForeground(Color.white);
          q10.setBounds(530,160,50,30);
          add(q10);
          q11=new JButton("11");
           q11.setBackground(Color.black);
          q11.setForeground(Color.white);
          q11.setBounds(580,160,50,30);
          add(q11);
          q12=new JButton("12");
           q12.setBackground(Color.black);
          q12.setForeground(Color.white);
          q12.setBounds(630,160,50,30);
          add(q12);

          q13=new JButton("13");
          q13.setBackground(Color.black);
          q13.setForeground(Color.white);
          q13.setBounds(480,190,50,30);
          add(q13);
          q14=new JButton("14");
          q14.setBackground(Color.black);
          q14.setForeground(Color.white);
          q14.setBounds(530,190,50,30);
          add(q14);
          q15=new JButton("15");
          q15.setBackground(Color.black);
          q15.setForeground(Color.white);
          q15.setBounds(580,190,50,30);
          add(q15);          

             t0= new JTextField();       //Question 
             t0.setBounds(40,70,400,30);
             t0.setBackground(Color.black);
             t0.setForeground(Color.white);
             add(t0);      

             r1=new JRadioButton();         //options 
             r1.setBounds(50,120,20,20);
             r1.setBackground(Color.black);
             r1.setForeground(Color.white);
             add(r1);

             r2=new JRadioButton();
             r2.setBounds(50,150,20,20);
             r2.setBackground(Color.black);
             r2.setForeground(Color.white);
             add(r2);

             r3=new JRadioButton();
             r3.setBackground(Color.black);
             r3.setForeground(Color.white);
             r3.setBounds(50,180,20,20);
             add(r3);

             r4=new JRadioButton();
             r4.setBackground(Color.black);
             r4.setForeground(Color.white);
             r4.setBounds(50,210,20,20);
             add(r4);

             t1= new JTextField();
             t1.setBackground(Color.black);
             t1.setForeground(Color.white);
             t1.setBounds(70,120,200,20);
             add(t1);

              t2= new JTextField();
              t2.setBackground(Color.black);
             t2.setForeground(Color.white);
             t2.setBounds(70,150,200,20);
             add(t2);

              t3= new JTextField();
              t3.setBackground(Color.black);
             t3.setForeground(Color.white);
             t3.setBounds(70,180,200,20);
             add(t3);

              t4= new JTextField();
              t4.setBackground(Color.black);
             t4.setForeground(Color.white);
             t4.setBounds(70,210,200,20);
             add(t4);

          //b1.addActionListener(f);
         b1.addActionListener(this);
          b2.addActionListener(this);
          q1.addActionListener(this);
          q2.addActionListener(this);
          q3.addActionListener(this);
          q4.addActionListener(this);
          q5.addActionListener(this);
          q6.addActionListener(this);
          q7.addActionListener(this);
          q8.addActionListener(this);
          q9.addActionListener(this);
          q10.addActionListener(this);
          q11.addActionListener(this);
          q12.addActionListener(this);

	}	 
	public void paintComponent(Graphics g)
    {
    	
        g.drawImage(new ImageIcon("ques.png").getImage(),0,0,null);
    }
	public void actionPerformed(ActionEvent e)
	{  
		/*
		if(e.getSource()!=b1 && e.getSource()!=b2)
		{
           	currentStatus = (JButton)e.getSource();
		}

		if(e.getSource() == b1)
		{				
		System.out.println("xx"+currentStatus);	
		if(currentStatus == null) {
			t0.setText("Question1:  How many methods does object class has?");//c
			t1.setText("5");
			t2.setText("10");
			t3.setText("11");
			t4.setText("12");
			currentStatus = q1;
			}						
			 if(currentStatus == q1) {
			t0.setText("Question2:How many final methods does object class has?");//b
			t1.setText("5");
			t2.setText("6");
			t3.setText("7");
			t4.setText("4");
			 	currentStatus = q2;
			}
			if(currentStatus == q2) {
			t0.setText("Question3:If we have class A{} and class B extends A {},whic will be true among below ?");
			t1.setText("A a =new B();");
			t2.setText("B b =new A();");
			t3.setText("both a and b ");
			t4.setText("None ");
				currentStatus = q3;
			}
		}							

		*/
		
          
        if(e.getSource()==q1) 
		{         
			t0.setText("Question1:  How many methods does object class has?");//c
			t1.setText("5");
			t2.setText("10");
			t3.setText("11");
			t4.setText("12");											
		}
		if( e.getSource()==q2)
		{
			t0.setText("Question2:How many final methods does object class has?");//b
			t1.setText("5");
			t2.setText("6");
			t3.setText("7");
			t4.setText("4");
		}
		if(e.getSource()==q3)
		{
			t0.setText("Question3:If we have class A{} and class B extends A {},whic will be true among below ?");
			t1.setText("A a =new B();");
			t2.setText("B b =new A();");
			t3.setText("both a and b ");
			t4.setText("None ");
		}
		if(e.getSource()==q4)
		{
			t0.setText("Question4: long datatype of object will display in which from ?");
			t1.setText("[I@1234");
			t2.setText("[j@1234");
			t3.setText("1234");
			t4.setText("[f@1234");
		}
		if(e.getSource()==q5)
		{
			t0.setText("Question5: hashcode method will display hashcode in which from ?");
			t1.setText("decimal");
			t2.setText("hexadecimal");
			t3.setText("classname@hdn");
			t4.setText("None");
		}
        if(e.getSource()==q6)
		{
			t0.setText("Question 6: toString() method will display hashcode in which from ?");
			t1.setText("decimal");
			t2.setText("hexadecimal");
			t3.setText("classname@hdn");
			t4.setText("None");
		}
		if(e.getSource()==q7)
		{
			t0.setText("Question 7:Does java function works by-default as a virtual function ?");
			t1.setText("yes");   //a
			t2.setText("no");
			t3.setText("not as a by-default");
			t4.setText("by using vitual keywork only");
		}
		if(e.getSource()==q8)
		{
			t0.setText("Question 8: Method hiding id done at  ?");  //b
			t1.setText("run time ");
			t2.setText("Compile time ");
			t3.setText("does wokr in java");
			t4.setText("None");
		}
		if(e.getSource()==q9)
		{
			t0.setText("Question 9: which among below is false?");
			t1.setText("We cannot add frame in a frame ");
			t2.setText("we can add panel in a frame");
			t3.setText("we can add panel in a panel");
			t4.setText("we can add frame in a panel");   //d
		}
		if(e.getSource()==q10)
		{
			t0.setText("Question 10:Panel has by-default which Layout  ?");  //a
			t1.setText("FlowLayout");
			t2.setText("GridLayout");
			t3.setText("BorderLayout");
			t4.setText("CardLayout");
		}
		if(e.getSource()==q11)
		{
			t0.setText("Question 11: How many methods does CardLayout has ?");//a
			t1.setText("5");
			t2.setText("4");
			t3.setText("3");
			t4.setText("6");
		}
		if(e.getSource()==q12)
		{
			t0.setText("Question 12:Which class does not have equals() method?");
			t1.setText("Boolean");
			t2.setText("StringBuffer");
			t3.setText("String");
			t4.setText("None");
		}
		if(e.getSource()==q13)
		{
			t0.setText("Question 13:We cannot  create a class inside ?");
			t1.setText("method");
			t2.setText("constructor");
			t3.setText("control statment");
			t4.setText("none");
		}
		if(e.getSource()==q14)
		{
			t0.setText("Question 14: how many methods does Adaptor class has ?");
			t1.setText("7");
			t2.setText("5");
			t3.setText("10");
			t4.setText("3");
		}
		if(e.getSource()==q15)
		{
			t0.setText("Question15: Which method of object class will display object in form of classname@hdn ?");
			t1.setText("Boolean");
			t2.setText("toString");
			t3.setText("String");
			t4.setText("StringBuffer");
		}

	}
} 

	        
         
