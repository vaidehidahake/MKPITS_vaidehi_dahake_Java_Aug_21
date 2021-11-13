import javax.swing.*;
import java.awt.event.*;
class SwingExample2
{
	public static void main(String[] arg) 
	{
		JFrame f1=new JFrame("mkpits");
		JButton b1=new JButton("save");
		b1.setBounds(100,100,100,20);
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				System.out.println("hello from save button");
			}
		});

		f1.add(b1);
		f1.setLayout(null);
		f1.setSize(300,300);
		f1.setVisible(true);
	}
}
