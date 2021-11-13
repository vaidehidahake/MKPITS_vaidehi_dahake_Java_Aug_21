     //ex-4 Checkbox Example with ItemListener.
    import java.awt.*;
    import java.awt.event.*;
    public class CheckboxExample4
    {
         CheckboxExample4()
         {
            Frame f= new Frame("CheckBox Example");
            final Label label = new Label();
            label.setAlignment(Label.CENTER);
            label.setSize(400,100);
                     Checkbox Checkbox1=new Checkbox("c");
	             Checkbox1.setBounds(100,100,50,50);
	             Checkbox Checkbox2=new Checkbox("c++",true);
	             Checkbox2.setBounds(100,100,50,50);
	             Checkbox Checkbox3=new Checkbox("Java",true);
	             Checkbox3.setBounds(100,130,50,50);
	             Checkbox Checkbox4=new Checkbox("Python",true);
                     Checkbox4.setBounds(100,170,60,60);
            f.add(Checkbox1); f.add(Checkbox2);f.add(Checkbox3);
         f.add(Checkbox4); f.add(label);
           Checkbox1.addItemListener(new ItemListener()
            {
                 public void itemStateChanged(ItemEvent e)
                 {
                    label.setText("C Checkbox: "
                    + (e.getStateChange()==1?"checked":"unchecked"));
                 }
              });
            Checkbox2.addItemListener(new ItemListener()
            {
                 public void itemStateChanged(ItemEvent e)
                 {
                    label.setText("c++ Checkbox: "
                    + (e.getStateChange()==1?"checked":"unchecked"));
                 }
              });
              Checkbox3.addItemListener(new ItemListener()
	                  {
	                       public void itemStateChanged(ItemEvent e)
	                       {
	                          label.setText("Java Checkbox: "
	                          + (e.getStateChange()==1?"checked":"unchecked"));
	                       }
              });
              Checkbox4.addItemListener(new ItemListener()
	                  {
	                       public void itemStateChanged(ItemEvent e)
	                       {
	                          label.setText("Python Checkbox: "
	                          + (e.getStateChange()==1?"checked":"unchecked"));
	                       }
              });
            f.setSize(400,400);
            f.setLayout(null);
            f.setVisible(true);
         }
    public static void main(String args[])
    {
        new CheckboxExample4();
    }
    }
