//ex-3 checkbox group(example of quiz).
import java.awt.*;
import java.awt.event.*;
class CheckboxGroup3 extends Frame
{
   Checkbox r1,r2,r3,r4;
   CheckboxGroup cbg1,cbg2;
   Label l1,l2,l3;
   Button b1;

   CheckboxGroup3()
   {
      l1=new Label("Capital Of India?");
      l1.setBounds(10,50,100,30);
      add(l1);
      cbg1=new CheckboxGroup();
      r1=new Checkbox("Mumbai",cbg1,true);
      r1.setBounds(100,100,100,100);
      add(r1);

      r2=new Checkbox("Delhi",cbg1,false);
	  r2.setB
      r4=new Checkbox("Delhi",cbg2,false);
	  r4.setBounds(200,270,100,100);
      add(r4);

      b1=new Button("Result");
      b1.setBounds(300,350,100,30);
      b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){
		  int total=0;ounds(200,100,100,100);
      add(r2);

	  l2=new Label("Capital Of Maharashtra?");
	  l2.setBounds(10,200,200,100);
      add(l2);
      cbg2=new CheckboxGroup();
      r3=new Checkbox("Mumbai",cbg2,true);
	  r3.setBounds(100,270,100,100);
      add(r3);
		  if(r2.getState()==true)
		  {
			  total=total+1;
		  }
		  else if(r3.getState()==true)
		  {
		  	  total=total+1;
		  }
		  l3.setText("score out of 2 is:"+total);
	  }
      });
      add(b1);
      l3=new Label("info");
      l3.setBounds(10,350,200,100);
      add(l3);
      setLayout(null);
      setSize(400,400);
      setVisible(true);
}
public static void main(String args[])
{
	CheckboxGroup3 c1=new CheckboxGroup3();
}
}



