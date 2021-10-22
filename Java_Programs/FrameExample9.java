//ex-3 example to give a title inside frame.
import java.awt.*;
class FrameExample9
{
  FrameExample9()
  {
  Frame fr=new Frame();
  Button b1=new Button("OK");
  b1.setBounds(150,100,100,50);
  fr.add(b1);
  fr.setLayout(null);
  fr.setTitle("Welcome to MKPITS");
  fr.setSize(400,400);
  fr.setVisible(true);
  }
  
  public static void main(String args[])
  {
    FrameExample9 f1=new FrameExample9();
   }
}
