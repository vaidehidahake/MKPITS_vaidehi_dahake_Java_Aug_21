// assignment.
import java.awt.*;
import java.awt.event.*;
class CheckboxGroup7 extends Frame
{
    Checkbox r1,r2;
    CheckboxGroup cbg1;
    Label l1,l2,l3;
    TextField t1,t2;
    Button b1;
    CheckboxGroup7()
    {
     l1=new Label("Account Number");
     l1.setBounds(20,50,100,25);
     add(l1);
     t1=new TextField();
     t1.setBounds(130,50,100,25);
     add(t1);
     l2=new Label("Amount");
     l2.setBounds(20,100,100,25);
     add(l2);
     t2=new TextField();
     t2.setBounds(130,100,100,25);
     add(t2);

     cbg1=new CheckboxGroup();
     r1=new Checkbox("Deposit",cbg1,true);
     r1.setBounds(200,200,100,30);
     add(r1);
     r2=new Checkbox("Withdrawl",cbg1,false);
     r2.setBounds(300,200,100,30);
     add(r2);

     b1=new Button("OK");
     b1.setBounds(300,300,100,30);
     b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){
     int bal=Integer.parseInt(t1.getText());
     int amount=Integer.parseInt(t2.getText());
     if(r1.getState()==true)
     {
        bal=bal+amount;
      }
      else if(r2.getState()==true)
      {
       bal=bal-amount;
       }
       l3.setText("bal after deposited or withdrawn:"+bal);
       }
       });
       add(b1);
       l3=new Label("info");
       l3.setBounds(10,350,200,100);
       add(l3);
       setLayout(null);
       setSize(400,400);
       setVisible(true);
     }

     public static void main(String args[])
     {
        CheckboxGroup7 c1=new  CheckboxGroup7();
     }

 }







