class Thr3 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread"+i);
        }

    }
}
class Thr4 extends Thread
{
    public void run()
    {

        for (int i=0;i<=20;i++)
        {
            System.out.println("Thread" + i);
        }
    }
}

public class CurMAMi {
    public static void main(String arg[])
    {
        Thr3 ob=new Thr3();
        Thr4 ob1=new Thr4();
        Thread o=Thread.currentThread();
        System.out.println(ob1);
        System.out.println(o);
        System.out.println("Default thread priority of Main Thread: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(o.MAX_PRIORITY);

        System.out.println("The maximum thread priority of Main Thread is: " + Thread.currentThread().getPriority());
        ob.start();
        ob1.start();



    }
}
