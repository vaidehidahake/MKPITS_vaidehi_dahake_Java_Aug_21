//ex-1 example to create a login form.
import java.awt.*;
class FrameExample13
{
  FrameExample13()
  {
    Frame fr=new Frame();
    Label l1=new Label("Software Solutions");
    l1.setBounds(150,50,100,50);
    fr.add(l1);

    Label l2=new Label("Signin");
    l2.setBounds(150,50,100,50);
    fr.add(l2);

    Label l3=new Label("Username");
    l3.setBounds(50,130,100,30);
    fr.add(l3);

    TextField t1=new TextField();
    t1.setBounds(170,130,200,25);
    fr.add(t1);


    Label l4=new Label("Password");
    l4.setBounds(50,165,100,30);
    fr.add(l4);

    TextField t2=new TextField();
    t2.setBounds(170,165,200,25);
    fr.add(t2);

     Button b1=new Button("Student Login");
      b1.setBounds(155,200,100,30);
      fr.add(b1);
      fr.setLayout(null);

      fr.setTitle("Welcome to Institute");
      fr.setSize(400,400);
      fr.setVisible(true);
      }

      public static void main(String args[])
      {
        FrameExample13 f1=new FrameExample13();
       }
    }

