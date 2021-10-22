//ex-2.1)- By extending Frame class (inheritance).
import java.awt.*;
class FrameExample2 extends Frame
{
  FrameExample2()
  {
     setSize(100,100);
     setVisible(true);
  }
  
  public static void main(String args[])
  {
    FrameExample2 f=new FrameExample2();
  }
  
}  
  
  