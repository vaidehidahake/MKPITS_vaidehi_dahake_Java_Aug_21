//ex-2 checkbox group.
import java.awt.*;
import java.awt.event.*;
class CheckboxGroup2 extends Frame
{
   Checkbox r1,r2,r3;
   CheckboxGroup cbg1;
   Label l1,l2;
   Button b1;

   CheckboxGroup2()
   {
      l1=new Label("select gender");
      l1.setBounds(10,50,100,30);
      add(l1);
      cbg1=new CheckboxGroup();
      r1=new Checkbox("male",cbg1,true);
      r1.setBounds(100,100,100,100);
      add(r1);

      r2=new Checkbox("female",cbg1,false);
	  r2.setBounds(200,100,100,100);
      add(r2);

      r3=new Checkbox("transgender",cbg1,false);
	  r3.setBounds(300,100,100,100);
      add(r3);

      b1=new Button("OK");
      b1.setBounds(200,200,100,30);
      b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){
		  if(r1.getState()==true)
		  {
			  l2.setText("gender selected:male");
		  }
		  else if(r2.getState()==true)
		  {
		  	  l2.setText("gender selected:female");
		  }
		 else if(r3.getState()==true)
		  {
		 	  l2.setText("gender selected:transgender");
		  }
	  }
      });
      add(b1);
      l2=new Label("info");
      l2.setBounds(10,250,200,100);
      add(l2);
      setLayout(null);
      setSize(400,400);
      setVisible(true);
}
public static void main(String args[])
{
	CheckboxGroup2 c1=new CheckboxGroup2();
}
}



