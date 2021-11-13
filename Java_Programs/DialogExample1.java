//Awt Dialog
import java.awt.*;
import java.awt.event.*;
public class DialogExample1
{
	private static Dialog d;
      DialogExample1()
      {
         Frame f=new Frame();
         d=new Dialog(f,"DialogExample1",true);
         d.setLayout( new FlowLayout());
         Button b=new Button("OK");
         b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
        DialogExample1.d.setVisible(false);
	    }
	    });
        d.add(new Label("Click Button to continue"));
        d.add(b);
        d.setSize(400,400);
        d.setVisible(true);
      }
   public static void main(String args[])
   {
     DialogExample1 d1=new DialogExample1();
    }
 }