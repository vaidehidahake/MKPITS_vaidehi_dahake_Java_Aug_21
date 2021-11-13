//Example of Swing by Association inside constructor.
import javax.swing.*;  
public class SwingExample3
{  
JFrame f;  
SwingExample3()
{  
f=new JFrame();
          
JButton b=new JButton("click");
b.setBounds(130,100,100, 40);  
          
f.add(b);
          
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
}  

public static void main(String[] args) 
{  
SwingExample3 s1=new SwingExample3();  
}  
}  
