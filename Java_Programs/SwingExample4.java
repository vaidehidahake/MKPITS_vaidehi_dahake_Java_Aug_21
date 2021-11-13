//Simple example of Swing by inheritance.
    import javax.swing.*;  
    public class SwingExample4 extends JFrame
    { 
    JFrame f;  
    SwingExample4()
    {  
    JButton b=new JButton("click"); 
    b.setBounds(130,100,100, 40);  
              
    add(b); 
    setSize(400,500);  
    setLayout(null);  
    setVisible(true);  
    }  
    public static void main(String[] args) 
    {  
    SwingExample4 s1=new SwingExample4();  
    }
    }  
