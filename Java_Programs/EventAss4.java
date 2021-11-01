//assignment-4
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class EventAss4 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextArea l4;
	Button b1;
	TextField t1,t2,t3;
	EventAss4()
	{
		l1=new Label("EmployNo.");
		l1.setBounds(20,50,100,30);
		add(l1);
		t1=new TextField();
		t1.setBounds(130,50,100,30);
		add(t1);
		l2=new Label("EmployName");
		l2.setBounds(20,100,100,30);
		add(l2);
		t2=new TextField();
		t2.setBounds(133,100,100,30);
		add(t2);
		l3=new Label("Salary");
		l3.setBounds(20,150,100,30);
		add(l3);
		t3=new TextField();
		t3.setBounds(135,150,100,30);
		add(t3);
		b1=new Button("Result");
		b1.setBounds(170,200,100,30);
		b1.addActionListener(this);
		add(b1);
		l4=new TextArea(40,40);
		l4.setBounds(20,250,200,109);
		add(l4);
		setLayout(null);
		setSize(400,300);
		setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
		float bonus=0;
		int empno=Integer.parseInt(t1.getText());
		String empname=t2.getText();
		int salary=Integer.parseInt(t3.getText());
		StringBuilder sb=new StringBuilder();
		if(ae.getSource()==b1)
		{
			if(salary>=20000)
			{
				bonus=(float)0.35f*salary;
		    }
		    else if(salary>=10000)
		    {
				bonus=(float)0.25f*salary;
		    }
		    else
		    {
				bonus=(float)0.15f*salary;
		    }

		    sb.append(empno+"\n"+empname+"\n"+salary+"\n"+bonus);
		    l4.setText(sb.toString());


	    }
   }
   public static void main(String args[])
   {
	   EventAss4 f=new EventAss4();
   }
}



