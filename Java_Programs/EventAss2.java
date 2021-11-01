//assignment-2 wap to accept a num and print whether it is prime no. or not.
import java.awt.*;
import java.awt.event.*;
class EventAss2 extends Frame implements ActionListener
{
    Label l1,l2;
    TextField t1;
    Button b1;
    EventAss2()
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
		l2=new Label("condition");
	    l2.setBounds(20,130,100,25);
	    add(l2);
		setLayout(null);
		setSize(400,300);
		setVisible(true);
	}
	 public void actionPerformed(ActionEvent ae)
	   {
		   int num=Integer.parseInt(t1.getText());
		   int i,j;
		   if(ae.getSource()==b1)
		   {

			  for(i=2;i<=20;i++)
			   {
				   for(j=2;j<i;j++)
			   {
				   if(num%i==0)
				   {
					   System.out.println("not a prime number");
				   }
			    }
			     if(num==i)
			     {
					System.out.println("it is a prime number");
				  }

			   }
			   l2.setText("condtion:"+num);
		    }
	  }

	  public static void main(String args[])
	  {
		  EventAss2 f1=new EventAss2();
	  }

	}



