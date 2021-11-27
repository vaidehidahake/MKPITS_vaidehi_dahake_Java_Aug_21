import java.awt.*;
   public class test extends Frame
   {
            Button b;
    test()
    {
        b=new Button( "hello");
        b.setBounds(100,100,100,20);
        add(b);
        setLayout(null);
        setVisible(true);
        setSize(400,400);

    }
    public static void main(String arg[])
        {
         test t=new test();
        }
}
