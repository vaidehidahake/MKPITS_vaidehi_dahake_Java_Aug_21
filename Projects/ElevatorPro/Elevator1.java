import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Elevator1 extends JFrame{
    JToggleButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    JPanel p1,p2,p3;
    JLabel l1,l2,l3,l4,l5,l6;

    Elevator1()
    {
        JPanel p1=new JPanel();
        p1.setBounds(30,50,95,95);
        p1.setBackground(Color.LIGHT_GRAY);
        add(p1);
        l1=new JLabel("",JLabel.CENTER);
        l1.setFont(new Font("Serif",Font.PLAIN,50));
        p1.add(l1);
        JPanel p2=new JPanel();
        p2.setBounds(30,170,95,95);
        p2.setBackground(Color.LIGHT_GRAY);
        add(p2);
       ImageIcon icon =new ImageIcon("G:/triangleup.png");
       l2=new JLabel("",icon,JLabel.CENTER);
       l2.setIcon(icon);
       p2.add(l2);



        JPanel p3=new JPanel();
        p3.setBounds(30,298,95,95);
        p3.setBackground(Color.LIGHT_GRAY);
        add(p3);
        l3=new JLabel("",JLabel.CENTER);
        p3.add(l3);
        l4=new JLabel("",JLabel.CENTER);
        p3.add(l4);
        l5=new JLabel("",JLabel.CENTER);
        p3.add(l5);
        l6=new JLabel("",JLabel.CENTER);
        p3.add(l6);







        b1=new JToggleButton("1",false);
        b1.setBounds(160,50,60,60);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                l1.setText("1");


            }
        });
        add(b1);
        b2=new JToggleButton("2",false);
        b2.setBounds(230,50,60,60);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                l1.setText("2");


            }
        });

        add(b2);
        b3=new JToggleButton("3",false);
        b3.setBounds(160,120,60,60);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                l1.setText("3");
            }
        });

        add(b3);
        b4=new JToggleButton("4",false);
        b4.setBounds(230,120,60,60);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                l1.setText("4");

            }
        });

        add(b4);
        b5=new JToggleButton("5",false);
        b5.setBounds(160,190,60,60);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("5");


            }
        });

        add(b5);
        b6=new JToggleButton("6",false);
        b6.setBounds(230,190,60,60);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("6");

            }
        });

        add(b6);
        b7=new JToggleButton("L",false);
        b7.setBounds(160,262,60,60);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b7.isSelected())
                {
                    l3.setText("LIGHT ON");


                }
                else
                {
                    l3.setText("LIGHT OFF");
                }

            }
        });

        add(b7);
        b8=new JToggleButton("F",false);
        b8.setBounds(230,262,60,60);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b8.isSelected())
                {
                    l4.setText("FAN ON");
                }
                else
                {
                    l4.setText("FAN OFF");
                }
            }
        });
        add(b8);
        b9=new JToggleButton("O",false);
        b9.setBounds(160,332,60,60);
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b9.isSelected())
                {
                    l5.setText("DOOR OPEN");
                }

            }
        });

        add(b9);
        b10=new JToggleButton("C",false);
        b10.setBounds(230,332,60,60);
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b10.isSelected())
                {
                    l6.setText("DOOR CLOSE");
                }
            }
        });
        add(b10);




        setLayout(null);
        setSize(350,450);
        setVisible(true);




    }

    public static void main(String args[])
    {
        Elevator1 e=new Elevator1();
        e.ask();
    }

    final int maxFloor=6;
    final int minFloor=1;
    int curFloor=1;
    int desFloor=0;



    void delay(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }catch(Exception ee){}
    }

    void goUp()
    {
        upDirectImage();
        while(curFloor++ < desFloor)
        {
            l1.setText(String.valueOf(curFloor));
            System.out.println("going up....Current floor: "+curFloor);
            delay(1000);
        }
        curFloor--;
    }

    void goDown()
    {
        downDirectImage();
        while(curFloor-- > desFloor)
        {
            l1.setText(String.valueOf(curFloor));
            System.out.println("going down....Current floor: "+curFloor +" "+ "  Destination Floor | "+desFloor );
            delay(1000);
        }
        curFloor++;
    }

    void ask()
    {
        delay(2000);
        System.out.println("Current Floor:  "+curFloor+" | Enter Destination Floor:  ");
        delay(1000);

        if(b1.isSelected())
        {
            desFloor=Integer.parseInt(b1.getText());
        }
        else if(b2.isSelected())
        {
            desFloor=Integer.parseInt(b2.getText());

        }
        else if(b3.isSelected())
        {
            desFloor=Integer.parseInt(b3.getText());

        }
        else if(b4.isSelected())
        {
            desFloor=Integer.parseInt(b4.getText());

        }
        else if(b5.isSelected())
        {
            desFloor=Integer.parseInt(b5.getText());

        }
        else if(b6.isSelected())
        {
            desFloor=Integer.parseInt(b6.getText());

        }

        delay(2000);


        if(desFloor < minFloor || desFloor > maxFloor || desFloor == curFloor)
        {
            //System.out.println("Error..Floor out of range or selected floor is current floor");
            delay(2000);
            ask();

        }
        else
        {
            System.out.println("Door Closing...");
            delay(2000);
            if(desFloor < curFloor)
            {
                goDown();
                delay(2000);

            }
            else if(desFloor > curFloor)
            {
                goUp();
                delay(2000);
            }
        }
        System.out.println("Door Opening");


        ask();
    }


    void downDirectImage()
    {
        ImageIcon icon =new ImageIcon("G:/triangledown.png");
        l2=new JLabel("",icon,JLabel.CENTER);
        l2.setIcon(icon);
       add(l2);
    }

    void upDirectImage()
    {
        ImageIcon icon =new ImageIcon("G:/triangleup.png");
        l2=new JLabel("",icon,JLabel.CENTER);
        l2.setIcon(icon);
       add(l2);


    }

}






