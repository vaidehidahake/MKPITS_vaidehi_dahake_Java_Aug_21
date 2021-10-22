//ex-5 example to create a button inside frame.
import java.awt.*;
class FrameExample11
{
  FrameExample11()
  {
  Frame fr=new Frame();
  Button b1=new Button("OK");
  b1.setBounds(150,100,100,50);
  fr.add(b1);
  fr.setLayout(null);
  fr.setSize(400,400);
  fr.setVisible(true);
  }
  public static void main(String args[])
  {
    FrameExample11 f1=new FrameExample11();
   }
}
