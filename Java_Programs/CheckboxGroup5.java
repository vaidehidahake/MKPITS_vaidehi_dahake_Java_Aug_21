//ex-5 checkbox group(registration form).
import java.awt.*;
class CheckboxGroup5
{
    Label l1,l2,l3,l4;
    TextField tf;
    Button b1;
    CheckboxGroup5()
    {
        Frame f= new Frame("CheckboxGroup Example");
        l1=new Label("register yourself");
        l1.setBounds(200,50,100,20);
        f.add(l1);

        l2=new Label("your name");
        l2.setBounds(10,120,100,20);
        f.add(l2);
        tf=new TextField();
        tf.setBounds(130,120,100,20);
        f.add(tf);

        l3=new Label("select course ");
        l3.setBounds(10,170,100,20);
        f.add(l3);



        Checkbox checkBox1 = new Checkbox("C++",  false);
        checkBox1.setBounds(130,150, 50,50);
        Checkbox checkBox2 = new Checkbox("Java",  true);
        checkBox2.setBounds(200,150, 50,50);
        f.add(checkBox1);
        f.add(checkBox2);

        l4=new Label("select gender ");
        l4.setBounds(10,210,100,20);
        f.add(l4);
        CheckboxGroup cbg1 = new CheckboxGroup();
        Checkbox checkBox11 = new Checkbox("Male", cbg1, false);
        checkBox11.setBounds(120,200, 50,50);
        Checkbox checkBox22 = new Checkbox("Female", cbg1, true);
        checkBox22.setBounds(180,200, 50,50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.add(checkBox11);
        f.add(checkBox22);


        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        CheckboxGroup5 c1=new CheckboxGroup5();
    }
}