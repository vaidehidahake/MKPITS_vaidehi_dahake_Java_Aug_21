//ex-4 wap to accept 2 no. and print addition of 2 no.
import java.awt.*;
import java.awt.event.*;
class EventExample4 extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b1;
EventExample4()
{
	l1=new Label("enter number");
	l1.setBounds(20,50,100,25);
	add(l1);
	t1=new TextField();
	t1.setBounds(130,50,100,25);
	add(t1);
	t2=new TextField();
	t2.setBounds(130,70,100,25);
	add(t2);
	l2=new Label("Addition:");
	l2.setBounds(20,150,100,25);
	add(l2);
	b1=new Button("OK");
	b1.setBounds(100,100,100,25);
	b1.addActionListener(this);
	add(b1);
	setLayout(null);
	setSize(400,400);
	setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
	int num1=Integer.parseInt(t1.getText());
	int num2=Integer.parseInt(t2.getText());
	int ad=num1+num2;
	l2.setText("Addition:"+ad);
}
public static void main(String args[])
{
	EventExample4 e1=new EventExample4();
}
}


