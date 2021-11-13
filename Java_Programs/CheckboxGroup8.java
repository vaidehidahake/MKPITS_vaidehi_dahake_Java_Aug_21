// assignment-registration form.
import java.awt.*;
import java.awt.event.*;
class CheckboxGroup8 extends Frame
{
    Checkbox r1,r2,r3,r4;
    CheckboxGroup cbg1,cbg2;
    Label l1,l2,l3,l4;
    TextField t1;
    Button b1;
    CheckboxGroup8()
    {
     l1=new Label("UserName");
     l1.setBounds(20,50,100,25);
     add(l1);
     t1=new TextField();
     t1.setBounds(130,50,100,25);
     add(t1);
     l2=new Label("Select Gender");
     l2.setBounds(20,100,100,25);
     add(l2);
     cbg1=new CheckboxGroup();
     r1=new Checkbox("Male",cbg1,true);
     r1.setBounds(130,100,100,30);
     add(r1);
     r2=new Checkbox("Female",cbg1,false);
     r2.setBounds(250,100,100,30);
     add(r2);
     l3=new Label("Select Hobby");
	 l3.setBounds(20,200,100,25);
     add(l3);
     cbg2=new CheckboxGroup();
	 r3=new Checkbox("Badminton",cbg2,true);
	 r3.setBounds(130,200,100,30);
	 add(r3);
	 r4=new Checkbox("Drawing",cbg2,false);
	 r4.setBounds(250,200,100,30);
     add(r4);

     b1=new Button("OK");
     b1.setBounds(300,300,100,30);
     b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){

     if(r1.getState()==true)
     {
        l4.setText("Male");
     }

      else if(r2.getState()==true)
      {
        l4.setText("Female");
      }
      else if(r3.getState()==true)
      {
        l4.setText("Badminton");
      }
       else if(r4.getState()==true)
	  {
	    l4.setText("Drawing");
      }

       }
       });
       add(b1);
       l4=new Label("info");
       l4.setBounds(10,350,200,100);
       add(l4);

       setLayout(null);
       setTitle("Registration Form");
       setSize(400,400);
       setVisible(true);
     }

     public static void main(String args[])
     {
        CheckboxGroup8 c1=new  CheckboxGroup8();
     }

 }







