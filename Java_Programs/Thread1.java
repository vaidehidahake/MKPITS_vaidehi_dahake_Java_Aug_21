class Th5 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread"+i+""+getName());
        }

    }

}
class Th6 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread"+i+""+getName()+""+isAlive());
        }

    }

}

public class Thread1
{
    public static void main(String arg[])
    {
        Th5 ob1=new Th5();
        Th6 ob2=new Th6();
        ob1.start();
        ob2.start();
        Thread o=Thread.currentThread();
        System.out.println(ob1);
        System.out.println(o);

    }
}
