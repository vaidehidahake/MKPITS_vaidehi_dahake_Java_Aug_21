//assignment-1 wap to accept a number and print factorial of number.
import java.awt.*;
import java.awt.event.*;
class EventAss1 extends Frame implements ActionListener
{
    Label l1,l2;
    TextField t1;
    Button b1;
    EventAss1()
    {
		l1=new Label("enter number");
		l1.setBounds(20,50,100,25);
		add(l1);
		t1=new TextField();
		t1.setBounds(130,50,100,25);
		add(t1);
		b1=new Button("result");
		b1.setBounds(20,100,100,25);
		b1.addActionListener(this);
		add(b1);
		l2=new Label("factorial");
	    l2.setBounds(20,130,100,25);
		add(l2);
		setLayout(null);
		setSize(400,300);
		setVisible(true);
   }

   public void actionPerformed(ActionEvent ae)
   {
	   int num=Integer.parseInt(t1.getText());
	   int fact=1;
	   if(ae.getSource()==b1)
	   {

		   while(num>0)
		   {
			   fact=fact*num;
			   num--;
		   }
		   l2.setText("factorial:"+fact);
	    }
  }

  public static void main(String args[])
  {
	  EventAss1 f1=new EventAss1();
  }

}


