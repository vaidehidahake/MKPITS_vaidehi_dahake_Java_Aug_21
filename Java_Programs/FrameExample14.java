//assignment :1 signup form.
import java.awt.*;
class FrameExample14
{
  FrameExample14()
  {
     Frame fr=new Frame();

     Label l1=new Label("Username");
     l1.setBounds(50,130,100,30);
     fr.add(l1);

     TextField t1=new TextField();
     t1.setBounds(170,130,200,25);
     fr.add(t1);

      Label l2=new Label("Password");
	  l2.setBounds(50,165,100,30);
	  fr.add(l2);

	  TextField t2=new TextField();
	  t2.setBounds(170,165,200,25);
      fr.add(t2);


     Label l3=new Label("Email");
     l3.setBounds(50,200,100,30);
	  fr.add(l3);

     TextField t3=new TextField();
     t3.setBounds(170,200,200,25);
     fr.add(t3);

     Label l4=new Label("Mobile Number");
     l4.setBounds(50,235,100,30);
	  fr.add(l4);

     TextField t4=new TextField();
     t4.setBounds(170,235,200,25);
     fr.add(t4);

     Button b1=new Button("Register");
     b1.setBounds(155,300,200,30);
     fr.add(b1);
     fr.setLayout(null);

     fr.setTitle("Signup Form");
     fr.setSize(400,400);
     fr.setVisible(true);
     }

    public static void main(String args[])
     {
        FrameExample14 f1=new FrameExample14();
     }
}



