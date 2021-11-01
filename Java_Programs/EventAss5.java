//assignment-5
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class EventAss5 extends Frame implements ActionListener
{
	Label l1,l2,l3,l4;
	TextArea l5;
	Button b1;
	TextField t1,t2,t3,t4;
	EventAss5()
	{
		l1=new Label("Customer Name");
		l1.setBounds(20,50,100,30);
		add(l1);
		t1=new TextField();
		t1.setBounds(130,50,100,30);
		add(t1);
		l2=new Label("Product Name");
		l2.setBounds(20,100,100,30);
		add(l2);
		t2=new TextField();
		t2.setBounds(133,100,100,30);
		add(t2);
		l3=new Label("Product Price");
		l3.setBounds(20,150,100,30);
		add(l3);
		t3=new TextField();
		t3.setBounds(135,150,100,30);
		add(t3);
		l4=new Label("Quantity");
	        l4.setBounds(20,200,100,30);
	        add(l4);
	        t4=new TextField();
		t4.setBounds(138,200,100,30);
		add(t4);
		b1=new Button("Result");
		b1.setBounds(170,250,100,30);
		b1.addActionListener(this);
		add(b1);
		l5=new TextArea(40,40);
		l5.setBounds(20,300,200,109);
		add(l5);
		setLayout(null);
		setSize(400,300);
		setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
		int total=0;
		String custname=t1.getText();
		String prodname=t2.getText();
		int price=Integer.parseInt(t3.getText());
		int quantity=Integer.parseInt(t4.getText());
		StringBuilder sb=new StringBuilder();
		if(ae.getSource()==b1)
		{
		    total=price*quantity;
		}

		    sb.append(custname+"\n"+prodname+"\n"+price+"\n"+quantity+"\n"+total);
		    l5.setText(sb.toString());


	    }

   public static void main(String args[])
   {
	   EventAss5 f=new EventAss5();
   }
}



