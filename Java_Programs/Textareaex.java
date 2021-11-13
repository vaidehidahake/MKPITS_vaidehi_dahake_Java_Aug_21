//ex-6 of checkbox to do additon and substraction of 2 no.
import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Textareaex
{
    Textareaex()
    {
        Frame f= new Frame("Checkbox Example");
        Label label = new Label();
        label.setBounds(100,200,300,20);
        f.add(label);
        Label label1 = new Label();
        label1.setBounds(100,250,300,20);
        f.add(label1);
        TextField t1=new TextField();
        t1.setBounds(10,50,100,20);
        f.add(t1);
        TextField t2=new TextField();
        t2.setBounds(110,50,100,20);
        f.add(t2);

        Checkbox checkbox1 = new Checkbox("add");
        checkbox1.setBounds(100,100, 50,50);
        Checkbox checkbox2 = new Checkbox("substract", true);
        checkbox2.setBounds(100,150, 70,70);

        f.add(checkbox1);
        f.add(checkbox2);

        Button b11=new Button("result");
        b11.setBounds(10,300,100,50);
        b11.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                label.setText("");
                label1.setText("");
                int n1=Integer.parseInt(t1.getText());
                int n2=Integer.parseInt(t2.getText());
                int res=0;
                StringBuilder sb=new StringBuilder();
                if(checkbox1.getState()==true) {
                    res=n1+n2;
                    sb.append("add is " + res );
                }
                if(checkbox2.getState()==true) {
                    res=n1-n2;
                    sb.append("sub is " + res);
                }
                label.setText(sb.toString());
            }
        });
f.add(b11);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        Textareaex t=new Textareaex();
    }
}


