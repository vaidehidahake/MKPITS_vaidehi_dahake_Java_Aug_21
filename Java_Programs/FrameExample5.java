//ex-1 example to create a button inside frame.
import java.awt.*;
class FrameExample5 extends Frame
{
  FrameExample5()
  {
   Button b1=new Button("OK");
   b1.setBounds(150,100,100,50);
   add(b1);
   setLayout(null);
     setSize(500,500);
     setVisible(true);
  }

  public static void main(String args[])
  {
    FrameExample5 f=new FrameExample5();
  }

}

