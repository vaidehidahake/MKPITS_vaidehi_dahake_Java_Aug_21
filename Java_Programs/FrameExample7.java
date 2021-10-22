//ex-1 example to give a title inside frame.
import java.awt.*;
class FrameExample7 extends Frame
{
  FrameExample7()
  {
  Button b1=new Button("OK");
  b1.setBounds(150,100,100,50);
  add(b1);
  setLayout(null);
  setTitle("Welcome to MKPITS");
  setSize(400,400);
  setVisible(true);
  }
  public static void main(String args[])
  {
    FrameExample7 f1=new FrameExample7();
   }
}
