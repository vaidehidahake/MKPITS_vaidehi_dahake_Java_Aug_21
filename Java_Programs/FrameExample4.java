//ex-2 By creating the object of Frame class (association).
import java.awt.*;
class FrameExample4
{
   FrameExample4()
   {
   Frame fr=new Frame();
   fr.setSize(600,600);
   fr.setVisible(true);
   }

   public static  void  main(String args[])
   {
      FrameExample4 f=new FrameExample4();
   }

}