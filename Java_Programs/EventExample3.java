//ex-3 wap to accept a number and print square of the number.
import java.awt.*;
import java.awt.event.*;
class EventExample3 extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1;
	Button b1;
EventExample3()
{
	l1=new Label("enter number");
	l1.setBounds(20,50,100,25);
	add(l1);
	t1=new TextField();
	t1.setBounds(130,50,100,25);
	add(t1);
	l2=new Label("Square:");
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
	int sq=num1*num1;
	l2.setText("Square:"+sq);
}
public static void main(String args[])
{
	EventExample3 e1=new EventExample3();
}
}


