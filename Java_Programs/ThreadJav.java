class Th3 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread"+i+""+getName());
        }

    }
}
class Th4 extends Thread
{
    public void run()
    {
        for(int i=0;i<=15;i++)
        {
            System.out.println("Thread"+i+""+getName()+""+isAlive());
        }

    }
}
class The1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread"+i+""+getName()+""+isAlive());
        }

    }
}

public class ThreadJav {
    public static void main(String arg[])
    {
        Th3 ob1=new Th3();
        Th4 ob2=new Th4();
        The1 ob3=new The1();
        ob1.start();
        ob2.start();
        ob3.start();
    }
}
