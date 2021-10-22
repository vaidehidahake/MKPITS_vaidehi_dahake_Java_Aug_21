//ex-1.1)- By extending Frame class (inheritance).
import java.awt.*;
class FrameExample1 extends Frame
{
  FrameExample1()
  {
     setSize(400,400);
     setVisible(true);
  }
  
  public static void main(String args[])
  {
    FrameExample1 f=new FrameExample1();
  }
  
}  
  
  