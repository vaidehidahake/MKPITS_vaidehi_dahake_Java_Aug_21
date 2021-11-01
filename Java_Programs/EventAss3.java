//assignment-3 wap to accept a num and print the table of that number.
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class EventAss3 extends Frame implements ActionListener
{
	Label l1;
	TextArea l2;
	TextField t1;
	Button b1;
	EventAss3()
	{
		l1=new Label("number");
		l1.setBounds(20,50,100,25);
		add(l1);
		t1=new TextField();
		t1.setBounds(130,50,100,25);
		add(t1);


		 b1=new Button("result");
		 b1.setBounds(100,200,100,25);
         b1.addActionListener(this);
		add(b1);


		l2=new TextArea(30,30);
	    l2.setBounds(20,250,100,105);
		add(l2);


		setLayout(null);
		setSize(400,400);
		setVisible(true);

	}

		public void actionPerformed(ActionEvent ae)
		{
			int n=Integer.parseInt(t1.getText());
			int res=1;
			StringBuilder sb=new StringBuilder();
			if(ae.getSource() == b1)
			{
				for(int i=1;i<=10;i++)
				{
					res=n * i;
					sb.append(n + " * " + i + "=" + res + "\n");
				}
				l2.setText(sb.toString());

		}
		}

	public static void main(String[] arg)
	{
		EventAss3 f=new EventAss3();

	}


}
