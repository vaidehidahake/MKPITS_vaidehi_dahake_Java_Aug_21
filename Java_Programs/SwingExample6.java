import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingExample6 extends Frame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField t1;
	JCheckBox cb1,cb2;
	JButton b1;
	JRadioButton r1,r2;
	JComboBox jb1;
	SwingExample6()
	{
l1=new JLabel("Registration Form");
l1.setBounds(150,50,200,30);
add(l1);
l2=new JLabel("Username");
l2.setBounds(50,100,100,30);
add(l2);
t1=new JTextField();
t1.setBounds(150,100,100,30);
add(t1);

l3=new JLabel("Hobby");
l3.setBounds(50,150,100,30);
add(l3);
cb1=new JCheckBox("music");
cb1.setBounds(150,150,100,30);
add(cb1);
cb2=new JCheckBox("reading");
cb2.setBounds(250,150,100,30);
add(cb2);

l6=new JLabel("Gender");
l6.setBounds(50,200,100,30);
add(l6);
r1=new JRadioButton("male");
r1.setBounds(150,200,100,30);
add(r1);
r2=new JRadioButton("female");
r2.setBounds(250,200,100,30);
add(r2);
ButtonGroup bg=new ButtonGroup();
bg.add(r1);
bg.add(r2);
//combobox
l8=new JLabel("city ");
l8.setBounds(50,250,100,30);
add(l8);
String[] ct= {"nagpur","mumbai","delhi","amritsar" };
jb1=new JComboBox(ct);
jb1.setBounds(150,250,100,30);
add(jb1);


b1=new JButton("Register");
b1.setBounds(150,450,100,25);
b1.addActionListener(this);
add(b1);
l4=new JLabel("Username : ");
l4.setBounds(50,475,400,30);
add(l4);
l5=new JLabel("Hobby : ");
l5.setBounds(50,500,400,30);
add(l5);
l7=new JLabel("Gender : ");
l7.setBounds(50,525,400,30);
add(l7);
l9=new JLabel("City : ");
l9.setBounds(50,550,400,30);
add(l9);


setLayout(null);
setVisible(true);
setSize(400,600);
}
public void actionPerformed(ActionEvent ae) {
	l4.setText("Username : " + t1.getText() );
		StringBuilder sb=new StringBuilder();
		sb.append("hobby : ");
		if(cb1.isSelected() == true)
		{
			sb.append(" music ");
		}
		if(cb2.isSelected() == true)
			{
				sb.append(" reading ");
		}
		l5.setText(sb.toString());
		//for radiobutton
		StringBuilder sb3=new StringBuilder();

		if(r1.isSelected() == true)
			{
				sb3.append("Gender : male");
			}
			if(r2.isSelected() == true)
				{
					sb3.append(" Gender : female ");
			}
			l7.setText(sb3.toString());
			l9.setText("city : " + jb1.getItemAt(jb1.getSelectedIndex()));
			StringBuilder sb2=new StringBuilder();
			sb2.append("username : " + t1.getText() +"\n");
			sb2.append( sb.toString() +"\n");
			sb2.append( sb3.toString() +"\n");
JOptionPane.showMessageDialog(this,sb2.toString());
}
	public static void main(String[] arg) 
	{
		SwingExample6 ss=new SwingExample6();

	}

}