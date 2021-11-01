//ex-1 wap to accept 3 subject marks and display total, percentage and grade.
import java.awt.*;
import java.awt.event.*;
class EventExample6 extends Frame implements ActionListener
{
    Label l1,l2,l3,l4,l5,l6;
    TextField t1,t2,t3;
    Button b1;
    EventExample6()
    {
       l1=new Label("sub1 marks");
       l1.setBounds(20,50,100,30);
       add(l1);
       t1=new TextField();
       t1.setBounds(130,50,100,30);
       add(t1);
       l2=new Label("sub2 marks");
       l2.setBounds(20,100,100,30);
       add(l2);
       t2=new TextField();
       t2.setBounds(140,100,100,30);
       add(t2);
       l3=new Label("sub3 marks");
       l3.setBounds(20,150,100,30);
       add(l3);
       t3=new TextField();
       t3.setBounds(170,150,100,30);
       add(t3);
       b1=new Button("result");
       b1.setBounds(20,200,100,30);
       b1.addActionListener(this);
       add(b1);
       l4=new Label("total");
       l4.setBounds(125,200,100,30);
       add(l4);
       l5=new Label("per");
       l5.setBounds(230,200,100,30);
       add(l5);
       l6=new Label("grade");
	   l6.setBounds(330,200,100,30);
       add(l6);
       setLayout(null);
       setSize(400,400);
       setVisible(true);
      }
      public void actionPerformed(ActionEvent ae)
      {
         int s1=Integer.parseInt(t1.getText());
         int s2=Integer.parseInt(t2.getText());
         int s3=Integer.parseInt(t3.getText());
         int total=0;
         float per=0;
         String grade=null;


       if(ae.getSource() == b1)
       {
          total=s1+s2+s3;
          per=(float)(total/300.0f)*100.0f;
       if(per>=75)
       {
         grade="Distinction";
       }
       else if(per>=65 && per<75)
       {
          grade="First";
       }
       else
       {
         grade="Fail";
       }
       l4.setText("total:"+total);
       l5.setText("per:"+per);
       l6.setText("grade:"+grade);
       }
       }

    public static void main(String args[])
    {
       EventExample6 f=new  EventExample6();
    }

 }
