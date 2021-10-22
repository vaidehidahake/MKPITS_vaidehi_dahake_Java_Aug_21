//assignment :2 Calculator.
import java.awt.*;
class FrameExample15
{
   FrameExample15()
  {
     Frame fr=new Frame();
     TextField t1=new TextField();
     t1.setBounds(10,50,318,25);
     fr.add(t1);

	 Button b1=new Button("1");
	 b1.setBounds(15,90,100,30);
	 fr.add(b1);
	  fr.setLayout(null);

	 Button b2=new Button("2");
	 b2.setBounds(120,90,100,30);
	 fr.add(b2);
	  fr.setLayout(null);

	 Button b3=new Button("3");
	 b3.setBounds(225,90,100,30);
	 fr.add(b3);
	  fr.setLayout(null);

	 Button b4=new Button("4");
	 b4.setBounds(15,130,100,30);
	 fr.add(b4);
	  fr.setLayout(null);

	 Button b5=new Button("5");
	 b5.setBounds(120,130,100,30);
	 fr.add(b5);
	  fr.setLayout(null);

	 Button b6=new Button("6");
	 b6.setBounds(225,130,100,30);
	 fr.add(b6);
	  fr.setLayout(null);

	 Button b7=new Button("7");
	 b7.setBounds(15,170,100,30);
	 fr.add(b7);
	  fr.setLayout(null);

	 Button b8=new Button("8");
	 b8.setBounds(120,170,100,30);
	 fr.add(b8);
	  fr.setLayout(null);

	 Button b9=new Button("9");
	 b9.setBounds(225,170,100,30);
	 fr.add(b9);
	  fr.setLayout(null);

	 Button b10=new Button("+");
	 b10.setBounds(15,210,100,30);
	 fr.add(b10);
	  fr.setLayout(null);

	 Button b11=new Button("0");
	 b11.setBounds(120,210,100,30);
	 fr.add(b11);
	  fr.setLayout(null);

	 Button b12=new Button("=");
	 b12.setBounds(225,210,100,30);
	 fr.add(b12);
	  fr.setLayout(null);

	 Button b13=new Button("-");
	 b13.setBounds(15,250,100,30);
	 fr.add(b13);
	  fr.setLayout(null);

	 Button b14=new Button("c");
	 b14.setBounds(120,250,100,30);
	 fr.add(b14);
	  fr.setLayout(null);

	 Button b15=new Button("*");
	 b15.setBounds(225,250,100,30);
	 fr.add(b15);

	 fr.setSize(300,300);
	 fr.setVisible(true);
	 fr.setTitle("Calculator");
	 }

	 public static void main(String args[])
	 {
	        FrameExample15 f1=new FrameExample15();
	 }

	}


