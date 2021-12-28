class Thr extends Thread
{
    public void run()
    {
        if(getName().equals("Thread-5"))
        {
            System.out.println("hello");
        }
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread"+getName());

        }

    }
}
public class Thread2 {
    public static void main(String arg[])
    {
        Thr t1=new Thr();
        Thr t2=new Thr();
        Thr t3=new Thr();
        Thr t4=new Thr();
        Thr t5=new Thr();
        Thr t6=new Thr();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();


    }
}
