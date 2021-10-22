import java.awt.*;
class FrameExample16 extends Frame
{
FrameExample16()
{
Button b=new Button("click me");
b.setBounds(150,100,80,30);

add(b);
setSize(200,200);
setLayout(null);
setVisible(true);
}
public static void main(String args[])
{
FrameExample16 f=new FrameExample16();
}
}
