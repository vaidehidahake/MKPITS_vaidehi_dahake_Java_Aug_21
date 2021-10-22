//ex-2 example to create a button inside frame.
import java.awt.*;
class FrameExample6 extends Frame
{
  FrameExample6()
  {
  Button b1=new Button("OK");
  b1.setBounds(150,100,100,50);
  add(b1);
  setLayout(null);
  setSize(400,400);
  setVisible(true);
  }
  public static void main(String args[])
  {
    FrameExample6 f1=new FrameExample6();
   }
}
