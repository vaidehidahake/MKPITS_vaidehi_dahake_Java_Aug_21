import java.awt.*;
        import java.awt.event.*;
class ScrollbarExample3
{
    ScrollbarExample3()
    {
        Frame f= new Frame("Scrollbar Example");
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        final Scrollbar s=new Scrollbar();
        s.setOrientation(0);
        s.setBounds(100,100, 250,20);
        f.add(s);f.add(label);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        s.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Vertical Scrollbar value is:"+ s.getValue());
            }
        });
    }
    public static void main(String args[])
    {
        ScrollbarExample3 s1=new ScrollbarExample3();
    }
}
