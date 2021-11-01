//ex-9 event handling by outer class.
import java.awt.*;
import java.awt.event.*;
class EventExample9 extends Frame
{
   TextField t1;
   EventExample9()
   {

      t1=new TextField();
      t1.setBounds(20,50,100,30);
      add(t1);
      Button b1=new Button("Click Me");
      b1.setBounds(20,100,100,30);
      Outer o=new Outer(this);
      b1.addActionListener(o);
      add(b1);

      setLayout(null);
      setSize(400,400);
      setVisible(true);
   }

    public static void main(String args[])
    {
       new EventExample9();
    }
    class Outer implements ActionListener
    {
		EventExample9 obj;
		Outer(EventExample9 obj)
		{
			this.obj=obj;
	    }
    public void actionPerformed(ActionEvent ae)
    {
		obj.t1.setText("welcome");
    }
}

}

