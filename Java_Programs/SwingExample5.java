//example of login form.
import javax.swing.*;
import java.awt.event.*;
class SwingExample5 extends JFrame
{
	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField p1;
	SwingExample5()
	{
		//JFrame f1=new JFrame("mkpits");
		l1= new JLabel("username");
		l1.setBounds(10,50,100,20);
		add(l1);

		t1= new JTextField();
		t1.setBounds(120,50,100,20);
		add(t1);

		l2= new JLabel("password");
				l2.setBounds(10,100,100,20);
				add(l2);

				p1= new JPasswordField();
				p1.setBounds(120,100,100,20);
		add(p1);


				JButton b1=new JButton("save");
				b1.setBounds(100,150,100,20);
				b1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						//System.out.println("hello from save button");
						//t1.setText("welcome to mkpits");
						if(t1.getText().equals("admin") && p1.getText().equals("admin") ) {
							l3.setText("login successfull");
						}
						else
						{
							l3.setText("invalid credentials");
						}
					}
				});

				add(b1);

				l3= new JLabel("status :");
								l3.setBounds(10,200,100,20);
				add(l3);
				setLayout(null);
				setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] arg)
	{
		SwingExample5 sw= new SwingExample5();
	}
}
