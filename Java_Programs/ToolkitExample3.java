import java.awt.*;
 import java.awt.event.*;
    class ToolkitExample3
    {
    ToolkitExample3()
    {
    Frame f=new Frame();
    Image icon = Toolkit.getDefaultToolkit().getImage("G:\\C3.jpeg");
    f.setIconImage(icon);
    f.setLayout(null);
    f.setSize(400,400);
    f.setVisible(true);
    }
    public static void main(String args[])
    {
    ToolkitExample3 a1=new ToolkitExample3();
    }
    }
