//ex-1 By creating the object of Frame class (association).
import java.awt.*;
class FrameExample3
{
   FrameExample3()
   {
   Frame fr=new Frame();
   fr.setSize(200,200);
   fr.setVisible(true);
   }

   public static  void  main(String args[])
   {
      FrameExample3 f=new FrameExample3();
   }

}